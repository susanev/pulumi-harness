// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.platform.inputs.RoleAssignmentsPrincipalArgs;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RoleAssignmentsArgs extends com.pulumi.resources.ResourceArgs {

    public static final RoleAssignmentsArgs Empty = new RoleAssignmentsArgs();

    /**
     * Disabled or not.
     * 
     */
    @Import(name="disabled")
    private @Nullable Output<Boolean> disabled;

    /**
     * @return Disabled or not.
     * 
     */
    public Optional<Output<Boolean>> disabled() {
        return Optional.ofNullable(this.disabled);
    }

    /**
     * Identifier for role assignment.
     * 
     */
    @Import(name="identifier")
    private @Nullable Output<String> identifier;

    /**
     * @return Identifier for role assignment.
     * 
     */
    public Optional<Output<String>> identifier() {
        return Optional.ofNullable(this.identifier);
    }

    /**
     * Managed or not.
     * 
     */
    @Import(name="managed")
    private @Nullable Output<Boolean> managed;

    /**
     * @return Managed or not.
     * 
     */
    public Optional<Output<Boolean>> managed() {
        return Optional.ofNullable(this.managed);
    }

    /**
     * Org identifier.
     * 
     */
    @Import(name="orgId")
    private @Nullable Output<String> orgId;

    /**
     * @return Org identifier.
     * 
     */
    public Optional<Output<String>> orgId() {
        return Optional.ofNullable(this.orgId);
    }

    /**
     * Principal.
     * 
     */
    @Import(name="principals")
    private @Nullable Output<List<RoleAssignmentsPrincipalArgs>> principals;

    /**
     * @return Principal.
     * 
     */
    public Optional<Output<List<RoleAssignmentsPrincipalArgs>>> principals() {
        return Optional.ofNullable(this.principals);
    }

    /**
     * Project Identifier
     * 
     */
    @Import(name="projectId")
    private @Nullable Output<String> projectId;

    /**
     * @return Project Identifier
     * 
     */
    public Optional<Output<String>> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    /**
     * Resource group identifier.
     * 
     */
    @Import(name="resourceGroupIdentifier")
    private @Nullable Output<String> resourceGroupIdentifier;

    /**
     * @return Resource group identifier.
     * 
     */
    public Optional<Output<String>> resourceGroupIdentifier() {
        return Optional.ofNullable(this.resourceGroupIdentifier);
    }

    /**
     * Role identifier.
     * 
     */
    @Import(name="roleIdentifier")
    private @Nullable Output<String> roleIdentifier;

    /**
     * @return Role identifier.
     * 
     */
    public Optional<Output<String>> roleIdentifier() {
        return Optional.ofNullable(this.roleIdentifier);
    }

    private RoleAssignmentsArgs() {}

    private RoleAssignmentsArgs(RoleAssignmentsArgs $) {
        this.disabled = $.disabled;
        this.identifier = $.identifier;
        this.managed = $.managed;
        this.orgId = $.orgId;
        this.principals = $.principals;
        this.projectId = $.projectId;
        this.resourceGroupIdentifier = $.resourceGroupIdentifier;
        this.roleIdentifier = $.roleIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RoleAssignmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RoleAssignmentsArgs $;

        public Builder() {
            $ = new RoleAssignmentsArgs();
        }

        public Builder(RoleAssignmentsArgs defaults) {
            $ = new RoleAssignmentsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param disabled Disabled or not.
         * 
         * @return builder
         * 
         */
        public Builder disabled(@Nullable Output<Boolean> disabled) {
            $.disabled = disabled;
            return this;
        }

        /**
         * @param disabled Disabled or not.
         * 
         * @return builder
         * 
         */
        public Builder disabled(Boolean disabled) {
            return disabled(Output.of(disabled));
        }

        /**
         * @param identifier Identifier for role assignment.
         * 
         * @return builder
         * 
         */
        public Builder identifier(@Nullable Output<String> identifier) {
            $.identifier = identifier;
            return this;
        }

        /**
         * @param identifier Identifier for role assignment.
         * 
         * @return builder
         * 
         */
        public Builder identifier(String identifier) {
            return identifier(Output.of(identifier));
        }

        /**
         * @param managed Managed or not.
         * 
         * @return builder
         * 
         */
        public Builder managed(@Nullable Output<Boolean> managed) {
            $.managed = managed;
            return this;
        }

        /**
         * @param managed Managed or not.
         * 
         * @return builder
         * 
         */
        public Builder managed(Boolean managed) {
            return managed(Output.of(managed));
        }

        /**
         * @param orgId Org identifier.
         * 
         * @return builder
         * 
         */
        public Builder orgId(@Nullable Output<String> orgId) {
            $.orgId = orgId;
            return this;
        }

        /**
         * @param orgId Org identifier.
         * 
         * @return builder
         * 
         */
        public Builder orgId(String orgId) {
            return orgId(Output.of(orgId));
        }

        /**
         * @param principals Principal.
         * 
         * @return builder
         * 
         */
        public Builder principals(@Nullable Output<List<RoleAssignmentsPrincipalArgs>> principals) {
            $.principals = principals;
            return this;
        }

        /**
         * @param principals Principal.
         * 
         * @return builder
         * 
         */
        public Builder principals(List<RoleAssignmentsPrincipalArgs> principals) {
            return principals(Output.of(principals));
        }

        /**
         * @param principals Principal.
         * 
         * @return builder
         * 
         */
        public Builder principals(RoleAssignmentsPrincipalArgs... principals) {
            return principals(List.of(principals));
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(@Nullable Output<String> projectId) {
            $.projectId = projectId;
            return this;
        }

        /**
         * @param projectId Project Identifier
         * 
         * @return builder
         * 
         */
        public Builder projectId(String projectId) {
            return projectId(Output.of(projectId));
        }

        /**
         * @param resourceGroupIdentifier Resource group identifier.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupIdentifier(@Nullable Output<String> resourceGroupIdentifier) {
            $.resourceGroupIdentifier = resourceGroupIdentifier;
            return this;
        }

        /**
         * @param resourceGroupIdentifier Resource group identifier.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupIdentifier(String resourceGroupIdentifier) {
            return resourceGroupIdentifier(Output.of(resourceGroupIdentifier));
        }

        /**
         * @param roleIdentifier Role identifier.
         * 
         * @return builder
         * 
         */
        public Builder roleIdentifier(@Nullable Output<String> roleIdentifier) {
            $.roleIdentifier = roleIdentifier;
            return this;
        }

        /**
         * @param roleIdentifier Role identifier.
         * 
         * @return builder
         * 
         */
        public Builder roleIdentifier(String roleIdentifier) {
            return roleIdentifier(Output.of(roleIdentifier));
        }

        public RoleAssignmentsArgs build() {
            return $;
        }
    }

}