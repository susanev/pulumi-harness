// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissionsAll;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissionsDeployment;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissionsEnvironment;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissionsPipeline;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissionsProvisioner;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissionsService;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissionsTemplate;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissionsWorkflow;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class UserGroupPermissionsAppPermissions {
    private @Nullable List<UserGroupPermissionsAppPermissionsAll> alls;
    private @Nullable List<UserGroupPermissionsAppPermissionsDeployment> deployments;
    private @Nullable List<UserGroupPermissionsAppPermissionsEnvironment> environments;
    private @Nullable List<UserGroupPermissionsAppPermissionsPipeline> pipelines;
    private @Nullable List<UserGroupPermissionsAppPermissionsProvisioner> provisioners;
    private @Nullable List<UserGroupPermissionsAppPermissionsService> services;
    private @Nullable List<UserGroupPermissionsAppPermissionsTemplate> templates;
    private @Nullable List<UserGroupPermissionsAppPermissionsWorkflow> workflows;

    private UserGroupPermissionsAppPermissions() {}
    public List<UserGroupPermissionsAppPermissionsAll> alls() {
        return this.alls == null ? List.of() : this.alls;
    }
    public List<UserGroupPermissionsAppPermissionsDeployment> deployments() {
        return this.deployments == null ? List.of() : this.deployments;
    }
    public List<UserGroupPermissionsAppPermissionsEnvironment> environments() {
        return this.environments == null ? List.of() : this.environments;
    }
    public List<UserGroupPermissionsAppPermissionsPipeline> pipelines() {
        return this.pipelines == null ? List.of() : this.pipelines;
    }
    public List<UserGroupPermissionsAppPermissionsProvisioner> provisioners() {
        return this.provisioners == null ? List.of() : this.provisioners;
    }
    public List<UserGroupPermissionsAppPermissionsService> services() {
        return this.services == null ? List.of() : this.services;
    }
    public List<UserGroupPermissionsAppPermissionsTemplate> templates() {
        return this.templates == null ? List.of() : this.templates;
    }
    public List<UserGroupPermissionsAppPermissionsWorkflow> workflows() {
        return this.workflows == null ? List.of() : this.workflows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(UserGroupPermissionsAppPermissions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<UserGroupPermissionsAppPermissionsAll> alls;
        private @Nullable List<UserGroupPermissionsAppPermissionsDeployment> deployments;
        private @Nullable List<UserGroupPermissionsAppPermissionsEnvironment> environments;
        private @Nullable List<UserGroupPermissionsAppPermissionsPipeline> pipelines;
        private @Nullable List<UserGroupPermissionsAppPermissionsProvisioner> provisioners;
        private @Nullable List<UserGroupPermissionsAppPermissionsService> services;
        private @Nullable List<UserGroupPermissionsAppPermissionsTemplate> templates;
        private @Nullable List<UserGroupPermissionsAppPermissionsWorkflow> workflows;
        public Builder() {}
        public Builder(UserGroupPermissionsAppPermissions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.alls = defaults.alls;
    	      this.deployments = defaults.deployments;
    	      this.environments = defaults.environments;
    	      this.pipelines = defaults.pipelines;
    	      this.provisioners = defaults.provisioners;
    	      this.services = defaults.services;
    	      this.templates = defaults.templates;
    	      this.workflows = defaults.workflows;
        }

        @CustomType.Setter
        public Builder alls(@Nullable List<UserGroupPermissionsAppPermissionsAll> alls) {
            this.alls = alls;
            return this;
        }
        public Builder alls(UserGroupPermissionsAppPermissionsAll... alls) {
            return alls(List.of(alls));
        }
        @CustomType.Setter
        public Builder deployments(@Nullable List<UserGroupPermissionsAppPermissionsDeployment> deployments) {
            this.deployments = deployments;
            return this;
        }
        public Builder deployments(UserGroupPermissionsAppPermissionsDeployment... deployments) {
            return deployments(List.of(deployments));
        }
        @CustomType.Setter
        public Builder environments(@Nullable List<UserGroupPermissionsAppPermissionsEnvironment> environments) {
            this.environments = environments;
            return this;
        }
        public Builder environments(UserGroupPermissionsAppPermissionsEnvironment... environments) {
            return environments(List.of(environments));
        }
        @CustomType.Setter
        public Builder pipelines(@Nullable List<UserGroupPermissionsAppPermissionsPipeline> pipelines) {
            this.pipelines = pipelines;
            return this;
        }
        public Builder pipelines(UserGroupPermissionsAppPermissionsPipeline... pipelines) {
            return pipelines(List.of(pipelines));
        }
        @CustomType.Setter
        public Builder provisioners(@Nullable List<UserGroupPermissionsAppPermissionsProvisioner> provisioners) {
            this.provisioners = provisioners;
            return this;
        }
        public Builder provisioners(UserGroupPermissionsAppPermissionsProvisioner... provisioners) {
            return provisioners(List.of(provisioners));
        }
        @CustomType.Setter
        public Builder services(@Nullable List<UserGroupPermissionsAppPermissionsService> services) {
            this.services = services;
            return this;
        }
        public Builder services(UserGroupPermissionsAppPermissionsService... services) {
            return services(List.of(services));
        }
        @CustomType.Setter
        public Builder templates(@Nullable List<UserGroupPermissionsAppPermissionsTemplate> templates) {
            this.templates = templates;
            return this;
        }
        public Builder templates(UserGroupPermissionsAppPermissionsTemplate... templates) {
            return templates(List.of(templates));
        }
        @CustomType.Setter
        public Builder workflows(@Nullable List<UserGroupPermissionsAppPermissionsWorkflow> workflows) {
            this.workflows = workflows;
            return this;
        }
        public Builder workflows(UserGroupPermissionsAppPermissionsWorkflow... workflows) {
            return workflows(List.of(workflows));
        }
        public UserGroupPermissionsAppPermissions build() {
            final var o = new UserGroupPermissionsAppPermissions();
            o.alls = alls;
            o.deployments = deployments;
            o.environments = environments;
            o.pipelines = pipelines;
            o.provisioners = provisioners;
            o.services = services;
            o.templates = templates;
            o.workflows = workflows;
            return o;
        }
    }
}
