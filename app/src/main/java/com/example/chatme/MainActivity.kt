package com.example.chatme

import android.os.Bundle
import android.util.Log
import android.widget.ProgressBar
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.SnackbarDefaults.backgroundColor
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Email
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.BottomCenter
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Alignment.Companion.End
import androidx.compose.ui.Alignment.Companion.Start
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.HorizontalAlignmentLine
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.chatme.destinations.ChatScreenDestination
import com.example.chatme.destinations.ContactViewDestination
import com.example.chatme.destinations.SinUpScreenDestination
import com.example.chatme.ui.theme.ChatMeTheme
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.ValueEventListener
import com.google.firebase.database.ktx.database
import com.google.firebase.database.ktx.getValue
import com.google.firebase.ktx.Firebase
import com.ramcosta.composedestinations.DestinationsNavHost
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import kotlinx.coroutines.launch

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ChatMeTheme {

                DestinationsNavHost(navGraph = NavGraphs.root)


            }
        }
    }
}

@RootNavGraph(start = true)
@Destination
@Composable
fun LoginScreen(nav: DestinationsNavigator) {
    var passwordVisible by rememberSaveable { mutableStateOf(false) }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val auth: FirebaseAuth
    val context = LocalContext.current
    auth = FirebaseAuth.getInstance()

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Image(painter = painterResource(id = R.drawable.rectangle_8), contentDescription = "")

        Card(
            modifier = Modifier
                .size(410.dp, 590.dp)
                .align(Alignment.BottomCenter),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(60.dp, 0.dp, 0.dp, 0.dp),
        ) {
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Text(
                    text = "Log  in", color = Color(0xffFFA925), fontSize = 30.sp
                )
//               }
                Spacer(modifier = Modifier.padding(0.dp, 20.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .background(color = Color(0xffF6F7FB))
                        .width(350.dp)
                        .height(50.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        cursorColor = Color.Black
                    ),
                    value = email,
                    onValueChange = { news -> email = news },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.frame),
                            contentDescription = "",
                            modifier = Modifier,
                            tint = (Color(0xffC5C5C7))
                        )
                    },
                    placeholder = {
                        Text(
                            text = "Email",
                            fontSize = 12.sp,
                            color = Color.LightGray
                        )
                    },
                    // shape = RoundedCornerShape(30.dp),
                )
                Spacer(modifier = Modifier.padding(0.dp, 20.dp))
                OutlinedTextField(
                    modifier = Modifier
                        .background(color = Color(0xffF6F7FB))
                        .width(350.dp)
                        .height(50.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        cursorColor = Color.Black
                    ),
                    value = password,
                    onValueChange = { new -> password = new },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.frame__1_),
                            contentDescription = "",
                            modifier = Modifier,
                            tint = (Color(0xffC5C5C7))
                        )
                    },
                    placeholder = {
                        Text(
                            text = "password",
                            fontSize = 12.sp,
                            color = Color.LightGray
                        )
                    },
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {

                        IconButton(onClick = {
                            passwordVisible = passwordVisible != true
                        }) {
                            if (passwordVisible) {
                                Icon(
                                    painter = painterResource(R.drawable.baseline_visibility_24),
                                    contentDescription = "",
                                    tint = (Color(0xffC5C5C7))
                                )

                            } else {
                                Icon(
                                    painter = painterResource(R.drawable.baseline_visibility_off_24),
                                    contentDescription = "",
                                    tint = (Color(0xffC5C5C7))
                                )

                            }
                        }

                    }

                )
                TextButton(
                    onClick = { /*TODO*/ },
                    colors = ButtonDefaults.buttonColors(
                        contentColor = Color(0xffFFA925),
                        backgroundColor = Color.White
                    )
                ) {

                    Text(text = "Forgot password", fontSize = 12.sp)

                }

                Spacer(modifier = Modifier.padding(0.dp, 40.dp))
                Button(
                    onClick = {

                        auth.signInWithEmailAndPassword(email, password).addOnCompleteListener {
                            if (it.isSuccessful) {
                                nav.navigate(ChatScreenDestination(myEmail = email))
                                Toast.makeText(
                                    context,
                                    "log in secsess",
                                    Toast.LENGTH_SHORT
                                ).show()
                            } else {
                                it.exception?.printStackTrace()
                                // nav.navigate(ChatScreenDestination)
                                Toast.makeText(
                                    context,
                                    "password or email incorrect",
                                    Toast.LENGTH_SHORT
                                ).show()
                            }
                        }


                    }, modifier = Modifier
                        .width(317.dp)
                        .height(58.dp)
                ) {

                    Text(text = "Login", color = Color.White)

                }

                Spacer(modifier = Modifier.padding(0.dp, 20.dp))

                TextButton(onClick = {
                    nav.navigate(SinUpScreenDestination)


                }) {
                    Text(buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.Black))
                        { append("Don’t have a account?") }
                        append(" Sign up here")
                    })
                }
            }
        }
    }

}

@Destination
@Composable
fun SinUpScreen(nav: DestinationsNavigator) {
    lateinit var auth: FirebaseAuth
// ...
// Initialize Firebase Auth
    auth = Firebase.auth


    val context = LocalContext.current
    Toast.makeText(context, "Sign Up", Toast.LENGTH_LONG).show()
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by rememberSaveable { mutableStateOf(false) }

    // Write a message to the database

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Green)
    ) {
        Image(painter = painterResource(id = R.drawable.rectangle_8), contentDescription = "")

        Card(
            modifier = Modifier
                .size(410.dp, 590.dp)
                .align(Alignment.BottomCenter),
            backgroundColor = Color.White,
            shape = RoundedCornerShape(60.dp, 0.dp, 0.dp, 0.dp),
        ) {
            Column(
                modifier = Modifier
                    .background(Color.White)
                    .fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally

            ) {

                Text(
                    text = "Sign up ", color = Color(0xffFFA925), fontSize = 30.sp
                )
//               }
                Spacer(modifier = Modifier.padding(0.dp, 20.dp))

                OutlinedTextField(
                    modifier = Modifier
                        .background(color = Color(0xffF6F7FB))
                        .width(350.dp)
                        .height(50.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        cursorColor = Color.Black
                    ),
                    value = email,
                    onValueChange = { news -> email = news },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.frame),
                            contentDescription = "",
                            modifier = Modifier,
                            tint = (Color(0xffC5C5C7))
                        )
                    },
                    placeholder = {
                        Text(
                            text = "Email",
                            fontSize = 12.sp,
                            color = Color.LightGray
                        )
                    },
                )
                Spacer(modifier = Modifier.padding(0.dp, 20.dp))
                OutlinedTextField(
                    modifier = Modifier
                        .background(color = Color(0xffF6F7FB))
                        .width(350.dp)
                        .height(50.dp)
                        .align(Alignment.CenterHorizontally),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        cursorColor = Color.Black
                    ),
                    value = password,
                    onValueChange = { new -> password = new },
                    leadingIcon = {
                        Icon(
                            painter = painterResource(id = R.drawable.frame__1_),
                            contentDescription = "",
                            modifier = Modifier,
                            tint = (Color(0xffC5C5C7))
                        )
                    },
                    visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
                    trailingIcon = {

                        IconButton(onClick = {
                            passwordVisible = passwordVisible != true
                        }) {
                            if (passwordVisible) {
                                Icon(
                                    painter = painterResource(R.drawable.baseline_visibility_24),
                                    contentDescription = "",
                                    tint = (Color(0xffC5C5C7))
                                )

                            } else {
                                Icon(
                                    painter = painterResource(R.drawable.baseline_visibility_off_24),
                                    contentDescription = "",
                                    tint = (Color(0xffC5C5C7))
                                )

                            }
                        }

                    },
                    placeholder = {
                        Text(
                            text = "password",
                            fontSize = 12.sp,
                            color = Color.LightGray
                        )
                    },
                )
                Spacer(modifier = Modifier.padding(0.dp, 50.dp))
                Button(
                    onClick = {
                        if (email.isNotEmpty() && password.isNotEmpty()) {
//                            Box {
//                                CircularProgressIndicator()
//                            }

                            auth.createUserWithEmailAndPassword(email, password)
                                .addOnCompleteListener {
                                    if (it.isSuccessful) {
                                        Toast.makeText(
                                            context,
                                            "Authentication Successful .",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                        val user = auth.currentUser
                                        // updateUI(user)
                                    } else {
                                        it.exception?.printStackTrace()
                                        Toast.makeText(
                                            context,
                                            "Authentication failed \n example mmm@Gmail.com",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                        //  updateUI(null)
                                    }
                                }

                        } else {
                            Toast.makeText(context, "Empty .", Toast.LENGTH_SHORT).show()
                        }
                    }, modifier = Modifier
                        .width(317.dp)
                        .height(58.dp)
                ) {

                    Text(text = "Sign Up", color = Color.White)

                }

                Spacer(modifier = Modifier.padding(0.dp, 20.dp))

                TextButton(onClick = { nav.navigateUp() }) {
                    Text(buildAnnotatedString {
                        withStyle(style = SpanStyle(color = Color.Black))
                        { append("Do you have a account? ") }
                        append("Login here")
                    })

                }

            }

        }


    }


}


@Destination
@Composable
fun ChatScreen(nav: DestinationsNavigator, myEmail: String) {
    var content by remember { mutableStateOf("") }
    var mmmaseg by remember { mutableStateOf("") }
    var listconv by remember { mutableStateOf(emptyList<Massages>())  }




    val database = Firebase.database
    val myRef = database.getReference("massages")

    myRef.addValueEventListener(object : ValueEventListener {
        override fun onDataChange(dataSnapshot: DataSnapshot) {
            // This method is called once with the initial value and again
            // whenever data at this location is updated.
            val listmasseges = mutableListOf<Massages>()
            dataSnapshot.children.forEach { msg ->
                val from=msg.child("from").getValue(String::class.java).toString()
                val conttttent=msg.child("content").getValue(String::class.java).toString()
                val conversition= Massages(from,conttttent)

                listmasseges.add(conversition)

            }
            listconv=listmasseges
            val value = dataSnapshot.child("myEmail").getValue<String>()
            Log.d("KotlinActivity", "Value is: $value")
            if (value != null) {
                mmmaseg = value
            }
        }



        //ظهاد ترد الخطا لما يصير
        override fun onCancelled(error: DatabaseError) {
            // Failed to read value
            Log.w("KotlinActivity", "Failed to read value.", error.toException())
        }
    })



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Row(
            Modifier
                .width(412.dp)
                .background(color = Color.White)
        ) {
            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = { nav.navigateUp() },
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFFAFAFA)),
                modifier = Modifier
                    .padding(0.dp, 12.dp)
                    .size(50.dp, 50.dp)
            ) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(R.drawable.vector__5_),
                    tint = Color.LightGray,
                    contentDescription = "",

                    )
            }

            Spacer(modifier = Modifier.width(200.dp))
            Button(
                onClick = { },
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFFAFAFA)),
                modifier = Modifier
                    .padding(0.dp, 12.dp)
                    .size(50.dp, 50.dp)
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.vector__6_),
                    contentDescription = "",
                    modifier = Modifier.size(30.dp),
                    tint = Color.LightGray,
                )
            }

            Spacer(modifier = Modifier.width(20.dp))
            Button(
                onClick = {

                },
                shape = RoundedCornerShape(15.dp),
                colors = ButtonDefaults.buttonColors(Color(0xFFFAFAFA)),
                modifier = Modifier
                    .padding(0.dp, 12.dp)
                    .size(50.dp, 50.dp)
            ) {
                Icon(
                    modifier = Modifier.size(30.dp),
                    painter = painterResource(R.drawable.vector__7_),
                    tint = Color.LightGray,
                    contentDescription = "",

                    )
            }

        }
        Spacer(modifier = Modifier.padding(0.dp, 1.dp))
        val lazyListState = rememberLazyListState()
        Box(modifier = Modifier.fillMaxSize()) {
            Card(modifier = Modifier
                .fillMaxWidth()
                .height(690.dp)) {


               LazyColumn(
                    state = lazyListState,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(5.dp)

                ) {

                    items(listconv) {

                        if (myEmail == it.from) {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Card(
                                    shape = RoundedCornerShape(10.dp, 20.dp, 0.dp, 20.dp),
                                    backgroundColor = Color(0xffFFA925),
                                    modifier = Modifier.padding(4.dp, 0.dp),


                                    ) {
                                    Text(
                                        text = it.content,
                                        modifier = Modifier
                                            .padding(10.dp, 10.dp),
                                        color = Color.White, fontSize = 30.sp
                                    )
                                    Text(
                                        text = it.from,
                                        fontSize = 8.sp,
                                        modifier = Modifier.padding(5.dp, 5.dp)
                                    )
                                    Spacer(modifier = Modifier.padding(5.dp, 5.dp))
                                }
                            }
                        } else {
                            Row(
                                modifier = Modifier.fillMaxWidth(),
                                horizontalArrangement = Arrangement.Start
                            ) {
                                Card(
                                    modifier = Modifier.padding(4.dp, 0.dp),
                                    shape = RoundedCornerShape(5.dp, 10.dp, 30.dp, 5.dp),
                                    backgroundColor = Color.DarkGray
                                ) {
                                    Text(
                                        text = it.content,
                                        modifier = Modifier
                                            .padding(10.dp, 10.dp),
                                        color = Color.White, fontSize = 30.sp
                                    )
                                    Text(
                                        text = it.from,
                                        fontSize = 8.sp,
                                        modifier = Modifier.padding(5.dp, 5.dp)
                                    )
                                }

                            }
                        }


                    }


                }
            }

            val scope = rememberCoroutineScope()
            //Spacer(modifier = Modifier.height(420.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                .align(BottomCenter), ) {


                OutlinedTextField(

                    modifier = Modifier
                        .background(color = Color.White)
                        .fillMaxWidth()
                        .height(60.dp),
                    //.align(Alignment.CenterHorizontally),
                    value = content,
                    onValueChange = { newcontent -> content = newcontent },
                    placeholder = {
                        Text(
                            text = "Type something..",
                            color = Color.LightGray,
                            fontSize = 20.sp
                        )
                    },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        focusedBorderColor = Color.Black,
                        cursorColor = Color.Black
                    ),
                    trailingIcon = {
                        IconButton(modifier = Modifier
                            .background(color = Color(0xffF5F5F5)), onClick = {

                        }) {
                            Icon(
                                painter = painterResource(R.drawable.vector__9_),
                                contentDescription = "",
                                tint = (Color(0xffFFA925))
                            )
                        }
                    },
                    leadingIcon = {
                        IconButton(modifier = Modifier
                            .background(color = Color(0xffF5F5F5)),

                                onClick = {
                                    val newNode = myRef.push()
                                    newNode.setValue(Massages(myEmail, content))
                                    //زر الارسال   ******************--------********
                                    scope.launch {
                                        lazyListState.animateScrollToItem(listconv.size - 1)
                                    }
                                    content = ""
                                }

                        ) {
                            Icon(
                                painter = painterResource(R.drawable.vector__8_),
                                contentDescription = "",
                                tint = (Color(0xffFFA925))
                            )
                        }
                    }
                )
            }
        }
    }

}



@Destination
@Composable
fun ContactView(nav: DestinationsNavigator) {
    val bahet = remember { mutableStateOf("") }
    val showbahet = remember { mutableStateOf(false) }
    val cancelbaht = remember { mutableStateOf(false) }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier.padding(0.dp, 5.dp),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.Top
            ) {
                if (showbahet.value) {
                    TextField(
                        value = bahet.value,
                        onValueChange = { bahet.value = it },
                        label = { Text(text = "Search ", color = Color.Black) },
                        placeholder = { Text(text = "", color = Color.Black) },
                        singleLine = true,
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White),
                        trailingIcon = {
                            IconButton(onClick = { cancelbaht.value = true })
                            {
                                Icon(
                                    painter = painterResource(R.drawable.baseline_cancel_24),
                                    contentDescription = "",
                                    tint = (Color(0xffC5C5C7))
                                )
                            }
                        })

                    if (cancelbaht.value) {
                        showbahet.value = false
                        cancelbaht.value = false
                    }

                }
                IconButton(onClick = { showbahet.value = true }) {
                    Icon(
                        painter = painterResource(R.drawable.baseline_search_24),
                        contentDescription = "",
                        tint = Color.Black
                    )
                }
                Text(
                    text = "                          Home",
                    color = Color.Black,
                    modifier = Modifier.align(CenterVertically),
                    fontSize = 22.sp
                )
            }
        }
        FloatingActionButton(
            onClick = { }, modifier = Modifier
                .align(Alignment.BottomEnd)
                .padding(30.dp, 30.dp), backgroundColor = Color(0xFFFFA925)

        ) {
            Icon(

                painter = painterResource(R.drawable.baseline_chat_24),
                contentDescription = "",
                tint = Color.White
            )
        }
    }
}
