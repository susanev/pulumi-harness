// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DockerCredentialsArgs extends com.pulumi.resources.ResourceArgs {

    public static final DockerCredentialsArgs Empty = new DockerCredentialsArgs();

    /**
     * The reference to the password to use for the docker registry.
     * 
     */
    @Import(name="passwordRef", required=true)
    private Output<String> passwordRef;

    /**
     * @return The reference to the password to use for the docker registry.
     * 
     */
    public Output<String> passwordRef() {
        return this.passwordRef;
    }

    /**
     * The username to use for the docker registry.
     * 
     */
    @Import(name="username")
    private @Nullable Output<String> username;

    /**
     * @return The username to use for the docker registry.
     * 
     */
    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    /**
     * The reference to the username to use for the docker registry.
     * 
     */
    @Import(name="usernameRef")
    private @Nullable Output<String> usernameRef;

    /**
     * @return The reference to the username to use for the docker registry.
     * 
     */
    public Optional<Output<String>> usernameRef() {
        return Optional.ofNullable(this.usernameRef);
    }

    private DockerCredentialsArgs() {}

    private DockerCredentialsArgs(DockerCredentialsArgs $) {
        this.passwordRef = $.passwordRef;
        this.username = $.username;
        this.usernameRef = $.usernameRef;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DockerCredentialsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DockerCredentialsArgs $;

        public Builder() {
            $ = new DockerCredentialsArgs();
        }

        public Builder(DockerCredentialsArgs defaults) {
            $ = new DockerCredentialsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param passwordRef The reference to the password to use for the docker registry.
         * 
         * @return builder
         * 
         */
        public Builder passwordRef(Output<String> passwordRef) {
            $.passwordRef = passwordRef;
            return this;
        }

        /**
         * @param passwordRef The reference to the password to use for the docker registry.
         * 
         * @return builder
         * 
         */
        public Builder passwordRef(String passwordRef) {
            return passwordRef(Output.of(passwordRef));
        }

        /**
         * @param username The username to use for the docker registry.
         * 
         * @return builder
         * 
         */
        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        /**
         * @param username The username to use for the docker registry.
         * 
         * @return builder
         * 
         */
        public Builder username(String username) {
            return username(Output.of(username));
        }

        /**
         * @param usernameRef The reference to the username to use for the docker registry.
         * 
         * @return builder
         * 
         */
        public Builder usernameRef(@Nullable Output<String> usernameRef) {
            $.usernameRef = usernameRef;
            return this;
        }

        /**
         * @param usernameRef The reference to the username to use for the docker registry.
         * 
         * @return builder
         * 
         */
        public Builder usernameRef(String usernameRef) {
            return usernameRef(Output.of(usernameRef));
        }

        public DockerCredentialsArgs build() {
            $.passwordRef = Objects.requireNonNull($.passwordRef, "expected parameter 'passwordRef' to be non-null");
            return $;
        }
    }

}
