// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class SecretSshkeySshSshkeyReferenceCredential {
    private @Nullable String encryptedPassphrase;
    private @Nullable String key;
    private String userName;

    private SecretSshkeySshSshkeyReferenceCredential() {}
    public Optional<String> encryptedPassphrase() {
        return Optional.ofNullable(this.encryptedPassphrase);
    }
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SecretSshkeySshSshkeyReferenceCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String encryptedPassphrase;
        private @Nullable String key;
        private String userName;
        public Builder() {}
        public Builder(SecretSshkeySshSshkeyReferenceCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedPassphrase = defaults.encryptedPassphrase;
    	      this.key = defaults.key;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder encryptedPassphrase(@Nullable String encryptedPassphrase) {
            this.encryptedPassphrase = encryptedPassphrase;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public SecretSshkeySshSshkeyReferenceCredential build() {
            final var o = new SecretSshkeySshSshkeyReferenceCredential();
            o.encryptedPassphrase = encryptedPassphrase;
            o.key = key;
            o.userName = userName;
            return o;
        }
    }
}
