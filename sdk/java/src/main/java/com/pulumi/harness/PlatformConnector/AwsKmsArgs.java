// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.PlatformConnector.inputs.AwsKmsCredentialsArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AwsKmsArgs extends com.pulumi.resources.ResourceArgs {

    public static final AwsKmsArgs Empty = new AwsKmsArgs();

    /**
     * A reference to the Harness secret containing the ARN of the AWS KMS.
     * 
     */
    @Import(name="arnRef", required=true)
    private Output<String> arnRef;

    /**
     * @return A reference to the Harness secret containing the ARN of the AWS KMS.
     * 
     */
    public Output<String> arnRef() {
        return this.arnRef;
    }

    /**
     * The credentials to use for connecting to aws.
     * 
     */
    @Import(name="credentials", required=true)
    private Output<AwsKmsCredentialsArgs> credentials;

    /**
     * @return The credentials to use for connecting to aws.
     * 
     */
    public Output<AwsKmsCredentialsArgs> credentials() {
        return this.credentials;
    }

    /**
     * Connect using only the delegates which have these tags.
     * 
     */
    @Import(name="delegateSelectors")
    private @Nullable Output<List<String>> delegateSelectors;

    /**
     * @return Connect using only the delegates which have these tags.
     * 
     */
    public Optional<Output<List<String>>> delegateSelectors() {
        return Optional.ofNullable(this.delegateSelectors);
    }

    /**
     * Description of the resource.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Description of the resource.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier", required=true)
    private Output<String> identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Output<String> identifier() {
        return this.identifier;
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * The AWS region where the AWS Secret Manager is.
     * 
     */
    @Import(name="region", required=true)
    private Output<String> region;

    /**
     * @return The AWS region where the AWS Secret Manager is.
     * 
     */
    public Output<String> region() {
        return this.region;
    }

    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Optional<Output<List<String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private AwsKmsArgs() {}

    private AwsKmsArgs(AwsKmsArgs $) {
        this.arnRef = $.arnRef;
        this.credentials = $.credentials;
        this.delegateSelectors = $.delegateSelectors;
        this.description = $.description;
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.projectId = $.projectId;
        this.region = $.region;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AwsKmsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AwsKmsArgs $;

        public Builder() {
            $ = new AwsKmsArgs();
        }

        public Builder(AwsKmsArgs defaults) {
            $ = new AwsKmsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param arnRef A reference to the Harness secret containing the ARN of the AWS KMS.
         * 
         * @return builder
         * 
         */
        public Builder arnRef(Output<String> arnRef) {
            $.arnRef = arnRef;
            return this;
        }

        /**
         * @param arnRef A reference to the Harness secret containing the ARN of the AWS KMS.
         * 
         * @return builder
         * 
         */
        public Builder arnRef(String arnRef) {
            return arnRef(Output.of(arnRef));
        }

        /**
         * @param credentials The credentials to use for connecting to aws.
         * 
         * @return builder
         * 
         */
        public Builder credentials(Output<AwsKmsCredentialsArgs> credentials) {
            $.credentials = credentials;
            return this;
        }

        /**
         * @param credentials The credentials to use for connecting to aws.
         * 
         * @return builder
         * 
         */
        public Builder credentials(AwsKmsCredentialsArgs credentials) {
            return credentials(Output.of(credentials));
        }

        /**
         * @param delegateSelectors Connect using only the delegates which have these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(@Nullable Output<List<String>> delegateSelectors) {
            $.delegateSelectors = delegateSelectors;
            return this;
        }

        /**
         * @param delegateSelectors Connect using only the delegates which have these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(List<String> delegateSelectors) {
            return delegateSelectors(Output.of(delegateSelectors));
        }

        /**
         * @param delegateSelectors Connect using only the delegates which have these tags.
         * 
         * @return builder
         * 
         */
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Description of the resource.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param region The AWS region where the AWS Secret Manager is.
         * 
         * @return builder
         * 
         */
        public Builder region(Output<String> region) {
            $.region = region;
            return this;
        }

        /**
         * @param region The AWS region where the AWS Secret Manager is.
         * 
         * @return builder
         * 
         */
        public Builder region(String region) {
            return region(Output.of(region));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags Tags to associate with the resource. Tags should be in the form `name:value`.
         * 
         * @return builder
         * 
         */
        public Builder tags(String... tags) {
            return tags(List.of(tags));
        }

        public AwsKmsArgs build() {
            $.arnRef = Objects.requireNonNull($.arnRef, "expected parameter 'arnRef' to be non-null");
            $.credentials = Objects.requireNonNull($.credentials, "expected parameter 'credentials' to be non-null");
            $.identifier = Objects.requireNonNull($.identifier, "expected parameter 'identifier' to be non-null");
            $.region = Objects.requireNonNull($.region, "expected parameter 'region' to be non-null");
            return $;
        }
    }

}
