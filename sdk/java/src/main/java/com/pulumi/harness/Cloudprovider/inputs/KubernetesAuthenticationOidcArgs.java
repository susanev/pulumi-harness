// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Cloudprovider.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class KubernetesAuthenticationOidcArgs extends com.pulumi.resources.ResourceArgs {

    public static final KubernetesAuthenticationOidcArgs Empty = new KubernetesAuthenticationOidcArgs();

    @Import(name="clientIdSecretName", required=true)
    private Output<String> clientIdSecretName;

    public Output<String> clientIdSecretName() {
        return this.clientIdSecretName;
    }

    @Import(name="clientSecretSecretName")
    private @Nullable Output<String> clientSecretSecretName;

    public Optional<Output<String>> clientSecretSecretName() {
        return Optional.ofNullable(this.clientSecretSecretName);
    }

    @Import(name="identityProviderUrl", required=true)
    private Output<String> identityProviderUrl;

    public Output<String> identityProviderUrl() {
        return this.identityProviderUrl;
    }

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

    @Import(name="scopes")
    private @Nullable Output<List<String>> scopes;

    public Optional<Output<List<String>>> scopes() {
        return Optional.ofNullable(this.scopes);
    }

    @Import(name="username", required=true)
    private Output<String> username;

    public Output<String> username() {
        return this.username;
    }

    private KubernetesAuthenticationOidcArgs() {}

    private KubernetesAuthenticationOidcArgs(KubernetesAuthenticationOidcArgs $) {
        this.clientIdSecretName = $.clientIdSecretName;
        this.clientSecretSecretName = $.clientSecretSecretName;
        this.identityProviderUrl = $.identityProviderUrl;
        this.masterUrl = $.masterUrl;
        this.passwordSecretName = $.passwordSecretName;
        this.scopes = $.scopes;
        this.username = $.username;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(KubernetesAuthenticationOidcArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private KubernetesAuthenticationOidcArgs $;

        public Builder() {
            $ = new KubernetesAuthenticationOidcArgs();
        }

        public Builder(KubernetesAuthenticationOidcArgs defaults) {
            $ = new KubernetesAuthenticationOidcArgs(Objects.requireNonNull(defaults));
        }

        public Builder clientIdSecretName(Output<String> clientIdSecretName) {
            $.clientIdSecretName = clientIdSecretName;
            return this;
        }

        public Builder clientIdSecretName(String clientIdSecretName) {
            return clientIdSecretName(Output.of(clientIdSecretName));
        }

        public Builder clientSecretSecretName(@Nullable Output<String> clientSecretSecretName) {
            $.clientSecretSecretName = clientSecretSecretName;
            return this;
        }

        public Builder clientSecretSecretName(String clientSecretSecretName) {
            return clientSecretSecretName(Output.of(clientSecretSecretName));
        }

        public Builder identityProviderUrl(Output<String> identityProviderUrl) {
            $.identityProviderUrl = identityProviderUrl;
            return this;
        }

        public Builder identityProviderUrl(String identityProviderUrl) {
            return identityProviderUrl(Output.of(identityProviderUrl));
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

        public Builder scopes(@Nullable Output<List<String>> scopes) {
            $.scopes = scopes;
            return this;
        }

        public Builder scopes(List<String> scopes) {
            return scopes(Output.of(scopes));
        }

        public Builder scopes(String... scopes) {
            return scopes(List.of(scopes));
        }

        public Builder username(Output<String> username) {
            $.username = username;
            return this;
        }

        public Builder username(String username) {
            return username(Output.of(username));
        }

        public KubernetesAuthenticationOidcArgs build() {
            $.clientIdSecretName = Objects.requireNonNull($.clientIdSecretName, "expected parameter 'clientIdSecretName' to be non-null");
            $.identityProviderUrl = Objects.requireNonNull($.identityProviderUrl, "expected parameter 'identityProviderUrl' to be non-null");
            $.masterUrl = Objects.requireNonNull($.masterUrl, "expected parameter 'masterUrl' to be non-null");
            $.passwordSecretName = Objects.requireNonNull($.passwordSecretName, "expected parameter 'passwordSecretName' to be non-null");
            $.username = Objects.requireNonNull($.username, "expected parameter 'username' to be non-null");
            return $;
        }
    }

}
