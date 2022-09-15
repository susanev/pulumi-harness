// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetInputSetPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetInputSetPlainArgs Empty = new GetInputSetPlainArgs();

    /**
     * Unique identifier of the resource.
     * 
     */
    @Import(name="identifier")
    private @Nullable String identifier;

    /**
     * @return Unique identifier of the resource.
     * 
     */
    public Optional<String> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Name of the resource.
     * 
     */
    @Import(name="name")
    private @Nullable String name;

    /**
     * @return Name of the resource.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Unique identifier of the organization.
     * 
     */
    @Import(name="orgId", required=true)
    private String orgId;

    /**
     * @return Unique identifier of the organization.
     * 
     */
    public String orgId() {
        return this.orgId;
    }

    /**
     * Identifier of the pipeline
     * 
     */
    @Import(name="pipelineId", required=true)
    private String pipelineId;

    /**
     * @return Identifier of the pipeline
     * 
     */
    public String pipelineId() {
        return this.pipelineId;
    }

    /**
     * Unique identifier of the project.
     * 
     */
    @Import(name="projectId", required=true)
    private String projectId;

    /**
     * @return Unique identifier of the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    private GetInputSetPlainArgs() {}

    private GetInputSetPlainArgs(GetInputSetPlainArgs $) {
        this.identifier = $.identifier;
        this.name = $.name;
        this.orgId = $.orgId;
        this.pipelineId = $.pipelineId;
        this.projectId = $.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetInputSetPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetInputSetPlainArgs $;

        public Builder() {
            $ = new GetInputSetPlainArgs();
        }

        public Builder(GetInputSetPlainArgs defaults) {
            $ = new GetInputSetPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param identifier Unique identifier of the resource.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable String identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param name Name of the resource.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable String name) {
            $.name = name;
            return this;
        }

        /**
         * @param orgId Unique identifier of the organization.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param pipelineId Identifier of the pipeline
         * 
         * @return builder
         * 
         */
        public Builder pipelineId(String pipelineId) {
            $.pipelineId = pipelineId;
            return this;
        }

        /**
         * @param projectId Unique identifier of the project.
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            $.projectId = projectId;
            return this;
        }

        public GetInputSetPlainArgs build() {
            $.orgId = Objects.requireNonNull($.orgId, "expected parameter 'orgId' to be non-null");
            $.pipelineId = Objects.requireNonNull($.pipelineId, "expected parameter 'pipelineId' to be non-null");
            $.projectId = Objects.requireNonNull($.projectId, "expected parameter 'projectId' to be non-null");
            return $;
        }
    }

}
