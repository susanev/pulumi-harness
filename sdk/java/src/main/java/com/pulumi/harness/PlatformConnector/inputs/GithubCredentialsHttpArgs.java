// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GithubCredentialsHttpArgs extends com.pulumi.resources.ResourceArgs {

    public static final GithubCredentialsHttpArgs Empty = new GithubCredentialsHttpArgs();

    @Import(name="tokenRef", required=true)
    private Output<String> tokenRef;

    public Output<String> tokenRef() {
        return this.tokenRef;
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    @Import(name="usernameRef")
    private @Nullable Output<String> usernameRef;

    public Optional<Output<String>> usernameRef() {
        return Optional.ofNullable(this.usernameRef);
    }

    private GithubCredentialsHttpArgs() {}

    private GithubCredentialsHttpArgs(GithubCredentialsHttpArgs $) {
        this.tokenRef = $.tokenRef;
        this.username = $.username;
        this.usernameRef = $.usernameRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GithubCredentialsHttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GithubCredentialsHttpArgs $;

        public Builder() {
            $ = new GithubCredentialsHttpArgs();
        }

        public Builder(GithubCredentialsHttpArgs defaults) {
            $ = new GithubCredentialsHttpArgs(Objects.requireNonNull(defaults));
        }

        public Builder tokenRef(Output<String> tokenRef) {
            $.tokenRef = tokenRef;
            return this;
        }

        public Builder tokenRef(String tokenRef) {
            return tokenRef(Output.of(tokenRef));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public Builder usernameRef(@Nullable Output<String> usernameRef) {
            $.usernameRef = usernameRef;
            return this;
        }

        public Builder usernameRef(String usernameRef) {
            return usernameRef(Output.of(usernameRef));
        }

        public GithubCredentialsHttpArgs build() {
            $.tokenRef = Objects.requireNonNull($.tokenRef, "expected parameter 'tokenRef' to be non-null");
            return $;
        }
    }

}
