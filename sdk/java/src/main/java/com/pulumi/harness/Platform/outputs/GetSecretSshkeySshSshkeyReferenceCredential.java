// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecretSshkeySshSshkeyReferenceCredential {
    private String encryptedAssphrase;
    private String key;
    private String userName;

    private GetSecretSshkeySshSshkeyReferenceCredential() {}
    public String encryptedAssphrase() {
        return this.encryptedAssphrase;
    }
    public String key() {
        return this.key;
    }
    public String userName() {
        return this.userName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretSshkeySshSshkeyReferenceCredential defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String encryptedAssphrase;
        private String key;
        private String userName;
        public Builder() {}
        public Builder(GetSecretSshkeySshSshkeyReferenceCredential defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.encryptedAssphrase = defaults.encryptedAssphrase;
    	      this.key = defaults.key;
    	      this.userName = defaults.userName;
        }

        @CustomType.Setter
        public Builder encryptedAssphrase(String encryptedAssphrase) {
            this.encryptedAssphrase = Objects.requireNonNull(encryptedAssphrase);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder userName(String userName) {
            this.userName = Objects.requireNonNull(userName);
            return this;
        }
        public GetSecretSshkeySshSshkeyReferenceCredential build() {
            final var o = new GetSecretSshkeySshSshkeyReferenceCredential();
            o.encryptedAssphrase = encryptedAssphrase;
            o.key = key;
            o.userName = userName;
            return o;
        }
    }
}
