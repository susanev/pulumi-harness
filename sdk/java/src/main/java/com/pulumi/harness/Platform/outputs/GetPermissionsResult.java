// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.harness.platform.outputs.GetPermissionsPermission;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetPermissionsResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    /**
     * @return Organization Identifier
     * 
     */
    private @Nullable String orgId;
    /**
     * @return Response of the api
     * 
     */
    private List<GetPermissionsPermission> permissions;
    /**
     * @return Project Identifier
     * 
     */
    private @Nullable String projectId;

    private GetPermissionsResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    /**
     * @return Organization Identifier
     * 
     */
    public Optional<String> orgId() {
        return Optional.ofNullable(this.orgId);
    }
    /**
     * @return Response of the api
     * 
     */
    public List<GetPermissionsPermission> permissions() {
        return this.permissions;
    }
    /**
     * @return Project Identifier
     * 
     */
    public Optional<String> projectId() {
        return Optional.ofNullable(this.projectId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetPermissionsResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private @Nullable String orgId;
        private List<GetPermissionsPermission> permissions;
        private @Nullable String projectId;
        public Builder() {}
        public Builder(GetPermissionsResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.orgId = defaults.orgId;
    	      this.permissions = defaults.permissions;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(@Nullable String orgId) {
            this.orgId = orgId;
            return this;
        }
        @CustomType.Setter
        public Builder permissions(List<GetPermissionsPermission> permissions) {
            this.permissions = Objects.requireNonNull(permissions);
            return this;
        }
        public Builder permissions(GetPermissionsPermission... permissions) {
            return permissions(List.of(permissions));
        }
        @CustomType.Setter
        public Builder projectId(@Nullable String projectId) {
            this.projectId = projectId;
            return this;
        }
        public GetPermissionsResult build() {
            final var o = new GetPermissionsResult();
            o.id = id;
            o.orgId = orgId;
            o.permissions = permissions;
            o.projectId = projectId;
            return o;
        }
    }
}
