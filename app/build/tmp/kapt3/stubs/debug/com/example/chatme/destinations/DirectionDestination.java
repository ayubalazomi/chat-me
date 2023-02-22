package com.example.chatme.destinations;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavBackStackEntry;
import com.ramcosta.composedestinations.spec.*;

/**
 * DirectionDestination is a sealed version of [DirectionDestinationSpec]
 */
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003\u0082\u0001\u0003\u0004\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/chatme/destinations/DirectionDestination;", "Lcom/example/chatme/destinations/TypedDestination;", "", "Lcom/ramcosta/composedestinations/spec/DirectionDestinationSpec;", "Lcom/example/chatme/destinations/ContactViewDestination;", "Lcom/example/chatme/destinations/LoginScreenDestination;", "Lcom/example/chatme/destinations/SinUpScreenDestination;", "app_debug"})
public abstract interface DirectionDestination extends com.example.chatme.destinations.TypedDestination<kotlin.Unit>, com.ramcosta.composedestinations.spec.DirectionDestinationSpec {
    
    /**
     * DirectionDestination is a sealed version of [DirectionDestinationSpec]
     */
    @kotlin.Metadata(mv = {1, 8, 0}, k = 3)
    public final class DefaultImpls {
        
        @java.lang.Override()
        public static void argsFrom(@org.jetbrains.annotations.NotNull()
        com.example.chatme.destinations.DirectionDestination $this, @org.jetbrains.annotations.Nullable()
        android.os.Bundle bundle) {
        }
        
        @java.lang.Override()
        public static void argsFrom(@org.jetbrains.annotations.NotNull()
        com.example.chatme.destinations.DirectionDestination $this, @org.jetbrains.annotations.NotNull()
        androidx.lifecycle.SavedStateHandle savedStateHandle) {
        }
        
        @java.lang.Override()
        public static void argsFrom(@org.jetbrains.annotations.NotNull()
        com.example.chatme.destinations.DirectionDestination $this, @org.jetbrains.annotations.NotNull()
        androidx.navigation.NavBackStackEntry navBackStackEntry) {
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.util.List<androidx.navigation.NamedNavArgument> getArguments(@org.jetbrains.annotations.NotNull()
        com.example.chatme.destinations.DirectionDestination $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static java.util.List<androidx.navigation.NavDeepLink> getDeepLinks(@org.jetbrains.annotations.NotNull()
        com.example.chatme.destinations.DirectionDestination $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static com.ramcosta.composedestinations.spec.DestinationStyle getStyle(@org.jetbrains.annotations.NotNull()
        com.example.chatme.destinations.DirectionDestination $this) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public static com.ramcosta.composedestinations.spec.Direction invoke(@org.jetbrains.annotations.NotNull()
        com.example.chatme.destinations.DirectionDestination $this, @org.jetbrains.annotations.NotNull()
        kotlin.Unit navArgs) {
            return null;
        }
    }
}