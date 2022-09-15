// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Cloudprovider.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SpotState extends com.pulumi.resources.ResourceArgs {

    public static final SpotState Empty = new SpotState();

    /**
     * The Spot account ID
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<String> accountId;

    /**
     * @return The Spot account ID
     * 
     */
    public Optional<Output<String>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The name of the cloud provider.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the cloud provider.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The name of the Harness secret containing the spot account token
     * 
     */
    @Import(name="tokenSecretName")
    private @Nullable Output<String> tokenSecretName;

    /**
     * @return The name of the Harness secret containing the spot account token
     * 
     */
    public Optional<Output<String>> tokenSecretName() {
        return Optional.ofNullable(this.tokenSecretName);
    }

    private SpotState() {}

    private SpotState(SpotState $) {
        this.accountId = $.accountId;
        this.name = $.name;
        this.tokenSecretName = $.tokenSecretName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpotState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpotState $;

        public Builder() {
            $ = new SpotState();
        }

        public Builder(SpotState defaults) {
            $ = new SpotState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The Spot account ID
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<String> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The Spot account ID
         * 
         * @return builder
         * 
         */
        public Builder accountId(String accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param name The name of the cloud provider.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the cloud provider.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param tokenSecretName The name of the Harness secret containing the spot account token
         * 
         * @return builder
         * 
         */
        public Builder tokenSecretName(@Nullable Output<String> tokenSecretName) {
            $.tokenSecretName = tokenSecretName;
            return this;
        }

        /**
         * @param tokenSecretName The name of the Harness secret containing the spot account token
         * 
         * @return builder
         * 
         */
        public Builder tokenSecretName(String tokenSecretName) {
            return tokenSecretName(Output.of(tokenSecretName));
        }

        public SpotState build() {
            return $;
        }
    }

}
