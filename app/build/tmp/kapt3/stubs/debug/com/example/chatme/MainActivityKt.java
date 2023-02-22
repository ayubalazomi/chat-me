package com.example.chatme;

import android.os.Bundle;
import android.util.Log;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.*;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.*;
import androidx.compose.material.icons.Icons;
import androidx.compose.runtime.*;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.HorizontalAlignmentLine;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PasswordVisualTransformation;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextAlign;
import androidx.compose.ui.tooling.preview.Preview;
import com.example.chatme.destinations.ChatScreenDestination;
import com.example.chatme.destinations.ContactViewDestination;
import com.example.chatme.destinations.SinUpScreenDestination;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.ktx.Firebase;
import com.ramcosta.composedestinations.annotation.Destination;
import com.ramcosta.composedestinations.annotation.RootNavGraph;
import com.ramcosta.composedestinations.navigation.DestinationsNavigator;

@kotlin.Metadata(mv = {1, 8, 0}, k = 2, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u001a\u0010\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0007\u00a8\u0006\t"}, d2 = {"ChatScreen", "", "nav", "Lcom/ramcosta/composedestinations/navigation/DestinationsNavigator;", "myEmail", "", "ContactView", "LoginScreen", "SinUpScreen", "app_debug"})
public final class MainActivityKt {
    
    @androidx.compose.runtime.Composable()
    @com.ramcosta.composedestinations.annotation.Destination()
    @com.ramcosta.composedestinations.annotation.RootNavGraph(start = true)
    public static final void LoginScreen(@org.jetbrains.annotations.NotNull()
    com.ramcosta.composedestinations.navigation.DestinationsNavigator nav) {
    }
    
    @androidx.compose.runtime.Composable()
    @com.ramcosta.composedestinations.annotation.Destination()
    public static final void SinUpScreen(@org.jetbrains.annotations.NotNull()
    com.ramcosta.composedestinations.navigation.DestinationsNavigator nav) {
    }
    
    @androidx.compose.runtime.Composable()
    @com.ramcosta.composedestinations.annotation.Destination()
    public static final void ChatScreen(@org.jetbrains.annotations.NotNull()
    com.ramcosta.composedestinations.navigation.DestinationsNavigator nav, @org.jetbrains.annotations.NotNull()
    java.lang.String myEmail) {
    }
    
    @androidx.compose.runtime.Composable()
    @com.ramcosta.composedestinations.annotation.Destination()
    public static final void ContactView(@org.jetbrains.annotations.NotNull()
    com.ramcosta.composedestinations.navigation.DestinationsNavigator nav) {
    }
}