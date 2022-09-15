// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.inputs.EncryptedTextUsageScopeArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class EncryptedTextState extends com.pulumi.resources.ResourceArgs {

    public static final EncryptedTextState Empty = new EncryptedTextState();

    /**
     * Boolean that indicates whether or not to inherit the usage scopes from the secret manager
     * 
     */
    @Import(name="inheritScopesFromSecretManager")
    private @Nullable Output<Boolean> inheritScopesFromSecretManager;

    /**
     * @return Boolean that indicates whether or not to inherit the usage scopes from the secret manager
     * 
     */
    public Optional<Output<Boolean>> inheritScopesFromSecretManager() {
        return Optional.ofNullable(this.inheritScopesFromSecretManager);
    }

    /**
     * Name of the encrypted text secret
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the encrypted text secret
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Boolean that indicates whether or not the secret is scoped to the account
     * 
     */
    @Import(name="scopedToAccount")
    private @Nullable Output<Boolean> scopedToAccount;

    /**
     * @return Boolean that indicates whether or not the secret is scoped to the account
     * 
     */
    public Optional<Output<Boolean>> scopedToAccount() {
        return Optional.ofNullable(this.scopedToAccount);
    }

    /**
     * The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
     * 
     */
    @Import(name="secretManagerId")
    private @Nullable Output<String> secretManagerId;

    /**
     * @return The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
     * 
     */
    public Optional<Output<String>> secretManagerId() {
        return Optional.ofNullable(this.secretManagerId);
    }

    /**
     * Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
     * 
     */
    @Import(name="secretReference")
    private @Nullable Output<String> secretReference;

    /**
     * @return Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
     * 
     */
    public Optional<Output<String>> secretReference() {
        return Optional.ofNullable(this.secretReference);
    }

    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Import(name="usageScopes")
    private @Nullable Output<List<EncryptedTextUsageScopeArgs>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Optional<Output<List<EncryptedTextUsageScopeArgs>>> usageScopes() {
        return Optional.ofNullable(this.usageScopes);
    }

    /**
     * The value of the secret.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return The value of the secret.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private EncryptedTextState() {}

    private EncryptedTextState(EncryptedTextState $) {
        this.inheritScopesFromSecretManager = $.inheritScopesFromSecretManager;
        this.name = $.name;
        this.scopedToAccount = $.scopedToAccount;
        this.secretManagerId = $.secretManagerId;
        this.secretReference = $.secretReference;
        this.usageScopes = $.usageScopes;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(EncryptedTextState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private EncryptedTextState $;

        public Builder() {
            $ = new EncryptedTextState();
        }

        public Builder(EncryptedTextState defaults) {
            $ = new EncryptedTextState(Objects.requireNonNull(defaults));
        }

        /**
         * @param inheritScopesFromSecretManager Boolean that indicates whether or not to inherit the usage scopes from the secret manager
         * 
         * @return builder
         * 
         */
        public Builder inheritScopesFromSecretManager(@Nullable Output<Boolean> inheritScopesFromSecretManager) {
            $.inheritScopesFromSecretManager = inheritScopesFromSecretManager;
            return this;
        }

        /**
         * @param inheritScopesFromSecretManager Boolean that indicates whether or not to inherit the usage scopes from the secret manager
         * 
         * @return builder
         * 
         */
        public Builder inheritScopesFromSecretManager(Boolean inheritScopesFromSecretManager) {
            return inheritScopesFromSecretManager(Output.of(inheritScopesFromSecretManager));
        }

        /**
         * @param name Name of the encrypted text secret
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the encrypted text secret
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param scopedToAccount Boolean that indicates whether or not the secret is scoped to the account
         * 
         * @return builder
         * 
         */
        public Builder scopedToAccount(@Nullable Output<Boolean> scopedToAccount) {
            $.scopedToAccount = scopedToAccount;
            return this;
        }

        /**
         * @param scopedToAccount Boolean that indicates whether or not the secret is scoped to the account
         * 
         * @return builder
         * 
         */
        public Builder scopedToAccount(Boolean scopedToAccount) {
            return scopedToAccount(Output.of(scopedToAccount));
        }

        /**
         * @param secretManagerId The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder secretManagerId(@Nullable Output<String> secretManagerId) {
            $.secretManagerId = secretManagerId;
            return this;
        }

        /**
         * @param secretManagerId The id of the secret manager to associate the secret with. Once set, this field cannot be changed.
         * 
         * @return builder
         * 
         */
        public Builder secretManagerId(String secretManagerId) {
            return secretManagerId(Output.of(secretManagerId));
        }

        /**
         * @param secretReference Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
         * 
         * @return builder
         * 
         */
        public Builder secretReference(@Nullable Output<String> secretReference) {
            $.secretReference = secretReference;
            return this;
        }

        /**
         * @param secretReference Name of the existing secret. If you already have secrets created in a secrets manager such as HashiCorp Vault or AWS Secrets Manager, you do not need to re-create the existing secrets in Harness.
         * 
         * @return builder
         * 
         */
        public Builder secretReference(String secretReference) {
            return secretReference(Output.of(secretReference));
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(@Nullable Output<List<EncryptedTextUsageScopeArgs>> usageScopes) {
            $.usageScopes = usageScopes;
            return this;
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(List<EncryptedTextUsageScopeArgs> usageScopes) {
            return usageScopes(Output.of(usageScopes));
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(EncryptedTextUsageScopeArgs... usageScopes) {
            return usageScopes(List.of(usageScopes));
        }

        /**
         * @param value The value of the secret.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The value of the secret.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public EncryptedTextState build() {
            return $;
        }
    }

}
