package io.helidon.webclient.dns;

import io.netty.resolver.AddressResolverGroup;

import java.util.concurrent.atomic.AtomicReference;

public class CustomDnsResolver {

    public static final AtomicReference<AddressResolverGroup<?>> INSTANCE = new AtomicReference<>();

    public static void setResolver(AddressResolverGroup<?> resolver) {
        INSTANCE.set(resolver);
    }

    public static AddressResolverGroup<?> getResolver() {
        return INSTANCE.get();
    }
}
