// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Cloudprovider.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesAuthenticationUsernamePasswordArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesAuthenticationUsernamePasswordArgs Empty = new KubernetesAuthenticationUsernamePasswordArgs();

    @Import(name="masterUrl", required=true)
    private Output<String> masterUrl;

    public Output<String> masterUrl() {
        return this.masterUrl;
    }

    @Import(name="passwordSecretName", required=true)
    private Output<String> passwordSecretName;

    public Output<String> passwordSecretName() {
        return this.passwordSecretName;
    }

    @Import(name="username")
    private @Nullable Output<String> username;

    public Optional<Output<String>> username() {
        return Optional.ofNullable(this.username);
    }

    @Import(name="usernameSecretName")
    private @Nullable Output<String> usernameSecretName;

    public Optional<Output<String>> usernameSecretName() {
        return Optional.ofNullable(this.usernameSecretName);
    }

    private KubernetesAuthenticationUsernamePasswordArgs() {}

    private KubernetesAuthenticationUsernamePasswordArgs(KubernetesAuthenticationUsernamePasswordArgs $) {
        this.masterUrl = $.masterUrl;
        this.passwordSecretName = $.passwordSecretName;
        this.username = $.username;
        this.usernameSecretName = $.usernameSecretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesAuthenticationUsernamePasswordArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesAuthenticationUsernamePasswordArgs $;

        public Builder() {
            $ = new KubernetesAuthenticationUsernamePasswordArgs();
        }

        public Builder(KubernetesAuthenticationUsernamePasswordArgs defaults) {
            $ = new KubernetesAuthenticationUsernamePasswordArgs(Objects.requireNonNull(defaults));
        }

        public Builder masterUrl(Output<String> masterUrl) {
            $.masterUrl = masterUrl;
            return this;
        }

        public Builder masterUrl(String masterUrl) {
            return masterUrl(Output.of(masterUrl));
        }

        public Builder passwordSecretName(Output<String> passwordSecretName) {
            $.passwordSecretName = passwordSecretName;
            return this;
        }

        public Builder passwordSecretName(String passwordSecretName) {
            return passwordSecretName(Output.of(passwordSecretName));
        }

        public Builder username(@Nullable Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public Builder usernameSecretName(@Nullable Output<String> usernameSecretName) {
            $.usernameSecretName = usernameSecretName;
            return this;
        }

        public Builder usernameSecretName(String usernameSecretName) {
            return usernameSecretName(Output.of(usernameSecretName));
        }

        public KubernetesAuthenticationUsernamePasswordArgs build() {
            $.masterUrl = Objects.requireNonNull($.masterUrl, "expected parameter 'masterUrl' to be non-null");
            $.passwordSecretName = Objects.requireNonNull($.passwordSecretName, "expected parameter 'passwordSecretName' to be non-null");
            return $;
        }
    }

}
