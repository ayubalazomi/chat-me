package com.example.chatme.destinations;

import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.Composable;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NamedNavArgument;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDeepLink;
import androidx.navigation.NavHostController;
import androidx.navigation.NavType;
import com.example.chatme.destinations.ChatScreenDestination.NavArgs;
import com.ramcosta.composedestinations.navargs.primitives.DestinationsStringNavType;
import com.ramcosta.composedestinations.navigation.DependenciesContainerBuilder;
import com.ramcosta.composedestinations.navigation.DestinationDependenciesContainer;
import com.ramcosta.composedestinations.scope.DestinationScope;
import com.ramcosta.composedestinations.spec.DestinationSpec;
import com.ramcosta.composedestinations.spec.DestinationStyle;
import com.ramcosta.composedestinations.spec.DirectionDestinationSpec;
import com.ramcosta.composedestinations.spec.NavGraphSpec;
import com.ramcosta.composedestinations.spec.Route;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0002H\u0096\u0002J\u0011\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\nH\u0086\u0002J\u0012\u0010\u0018\u001a\u00020\u0019*\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0017R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\n8WX\u0096D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\nX\u0096\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f\u00a8\u0006\u001c"}, d2 = {"Lcom/example/chatme/destinations/ChatScreenDestination;", "Lcom/example/chatme/destinations/TypedDestination;", "Lcom/example/chatme/destinations/ChatScreenDestination$NavArgs;", "()V", "arguments", "", "Landroidx/navigation/NamedNavArgument;", "getArguments", "()Ljava/util/List;", "baseRoute", "", "getBaseRoute", "()Ljava/lang/String;", "route", "getRoute", "argsFrom", "bundle", "Landroid/os/Bundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "invoke", "Lcom/ramcosta/composedestinations/spec/Direction;", "navArgs", "myEmail", "Content", "", "Lcom/ramcosta/composedestinations/scope/DestinationScope;", "NavArgs", "app_debug"})
public final class ChatScreenDestination implements com.example.chatme.destinations.TypedDestination<com.example.chatme.destinations.ChatScreenDestination.NavArgs> {
    @org.jetbrains.annotations.NotNull()
    public static final com.example.chatme.destinations.ChatScreenDestination INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String baseRoute = "chat_screen";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String route = null;
    
    private ChatScreenDestination() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ramcosta.composedestinations.spec.Direction invoke(@org.jetbrains.annotations.NotNull()
    com.example.chatme.destinations.ChatScreenDestination.NavArgs navArgs) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.ramcosta.composedestinations.spec.Direction invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String myEmail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @androidx.annotation.RestrictTo(value = {androidx.annotation.RestrictTo.Scope.SUBCLASSES})
    @java.lang.Override()
    public java.lang.String getBaseRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String getRoute() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<androidx.navigation.NamedNavArgument> getArguments() {
        return null;
    }
    
    @androidx.compose.runtime.Composable()
    @java.lang.Override()
    public void Content(@org.jetbrains.annotations.NotNull()
    com.ramcosta.composedestinations.scope.DestinationScope<com.example.chatme.destinations.ChatScreenDestination.NavArgs> $this$Content) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.chatme.destinations.ChatScreenDestination.NavArgs argsFrom(@org.jetbrains.annotations.Nullable()
    android.os.Bundle bundle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.chatme.destinations.ChatScreenDestination.NavArgs argsFrom(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.SavedStateHandle savedStateHandle) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.chatme.destinations.ChatScreenDestination.NavArgs argsFrom(@org.jetbrains.annotations.NotNull()
    androidx.navigation.NavBackStackEntry navBackStackEntry) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<androidx.navigation.NavDeepLink> getDeepLinks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.ramcosta.composedestinations.spec.DestinationStyle getStyle() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\f\u001a\u00020\rH\u00d6\u0001J\t\u0010\u000e\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000f"}, d2 = {"Lcom/example/chatme/destinations/ChatScreenDestination$NavArgs;", "", "myEmail", "", "(Ljava/lang/String;)V", "getMyEmail", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_debug"})
    public static final class NavArgs {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String myEmail = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.chatme.destinations.ChatScreenDestination.NavArgs copy(@org.jetbrains.annotations.NotNull()
        java.lang.String myEmail) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public NavArgs(@org.jetbrains.annotations.NotNull()
        java.lang.String myEmail) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMyEmail() {
            return null;
        }
    }
}