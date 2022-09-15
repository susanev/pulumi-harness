// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecretSshkeyKerberoTgtPasswordSpec {
    private String password;

    private GetSecretSshkeyKerberoTgtPasswordSpec() {}
    public String password() {
        return this.password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretSshkeyKerberoTgtPasswordSpec defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String password;
        public Builder() {}
        public Builder(GetSecretSshkeyKerberoTgtPasswordSpec defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.password = defaults.password;
        }

        @CustomType.Setter
        public Builder password(String password) {
            this.password = Objects.requireNonNull(password);
            return this;
        }
        public GetSecretSshkeyKerberoTgtPasswordSpec build() {
            final var o = new GetSecretSshkeyKerberoTgtPasswordSpec();
            o.password = password;
            return o;
        }
    }
}
