// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GitlabCredentialsHttpArgs extends com.pulumi.resources.ResourceArgs {

    public static final GitlabCredentialsHttpArgs Empty = new GitlabCredentialsHttpArgs();

    @Import(name="passwordRef")
    private @Nullable Output<String> passwordRef;

    public Optional<Output<String>> passwordRef() {
        return Optional.ofNullable(this.passwordRef);
    }

    @Import(name="tokenRef")
    private @Nullable Output<String> tokenRef;

    public Optional<Output<String>> tokenRef() {
        return Optional.ofNullable(this.tokenRef);
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

    private GitlabCredentialsHttpArgs() {}

    private GitlabCredentialsHttpArgs(GitlabCredentialsHttpArgs $) {
        this.passwordRef = $.passwordRef;
        this.tokenRef = $.tokenRef;
        this.username = $.username;
        this.usernameRef = $.usernameRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GitlabCredentialsHttpArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GitlabCredentialsHttpArgs $;

        public Builder() {
            $ = new GitlabCredentialsHttpArgs();
        }

        public Builder(GitlabCredentialsHttpArgs defaults) {
            $ = new GitlabCredentialsHttpArgs(Objects.requireNonNull(defaults));
        }

        public Builder passwordRef(@Nullable Output<String> passwordRef) {
            $.passwordRef = passwordRef;
            return this;
        }

        public Builder passwordRef(String passwordRef) {
            return passwordRef(Output.of(passwordRef));
        }

        public Builder tokenRef(@Nullable Output<String> tokenRef) {
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

        public GitlabCredentialsHttpArgs build() {
            return $;
        }
    }

}
