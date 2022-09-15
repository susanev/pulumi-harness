// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class AwsCCCrossAccountAccessArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsCCCrossAccountAccessArgs Empty = new AwsCCCrossAccountAccessArgs();

    /**
     * The external id of the role to use for cross-account access. This is a random unique value to provide additional secure authentication.
     * 
     */
    @Import(name="externalId", required=true)
    private Output<String> externalId;

    /**
     * @return The external id of the role to use for cross-account access. This is a random unique value to provide additional secure authentication.
     * 
     */
    public Output<String> externalId() {
        return this.externalId;
    }

    /**
     * The ARN of the role to use for cross-account access.
     * 
     */
    @Import(name="roleArn", required=true)
    private Output<String> roleArn;

    /**
     * @return The ARN of the role to use for cross-account access.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    private AwsCCCrossAccountAccessArgs() {}

    private AwsCCCrossAccountAccessArgs(AwsCCCrossAccountAccessArgs $) {
        this.externalId = $.externalId;
        this.roleArn = $.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsCCCrossAccountAccessArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsCCCrossAccountAccessArgs $;

        public Builder() {
            $ = new AwsCCCrossAccountAccessArgs();
        }

        public Builder(AwsCCCrossAccountAccessArgs defaults) {
            $ = new AwsCCCrossAccountAccessArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param externalId The external id of the role to use for cross-account access. This is a random unique value to provide additional secure authentication.
         * 
         * @return builder
         * 
         */
        public Builder externalId(Output<String> externalId) {
            $.externalId = externalId;
            return this;
        }

        /**
         * @param externalId The external id of the role to use for cross-account access. This is a random unique value to provide additional secure authentication.
         * 
         * @return builder
         * 
         */
        public Builder externalId(String externalId) {
            return externalId(Output.of(externalId));
        }

        /**
         * @param roleArn The ARN of the role to use for cross-account access.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(Output<String> roleArn) {
            $.roleArn = roleArn;
            return this;
        }

        /**
         * @param roleArn The ARN of the role to use for cross-account access.
         * 
         * @return builder
         * 
         */
        public Builder roleArn(String roleArn) {
            return roleArn(Output.of(roleArn));
        }

        public AwsCCCrossAccountAccessArgs build() {
            $.externalId = Objects.requireNonNull($.externalId, "expected parameter 'externalId' to be non-null");
            $.roleArn = Objects.requireNonNull($.roleArn, "expected parameter 'roleArn' to be non-null");
            return $;
        }
    }

}
