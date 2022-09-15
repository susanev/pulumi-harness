// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetResourceGroupIncludedScope {
    /**
     * @return Account Identifier of the account
     * 
     */
    private String accountId;
    private String filter;
    /**
     * @return Unique identifier of the organization.
     * 
     */
    private String orgId;
    /**
     * @return Unique identifier of the project.
     * 
     */
    private String projectId;

    private GetResourceGroupIncludedScope() {}
    /**
     * @return Account Identifier of the account
     * 
     */
    public String accountId() {
        return this.accountId;
    }
    public String filter() {
        return this.filter;
    }
    /**
     * @return Unique identifier of the organization.
     * 
     */
    public String orgId() {
        return this.orgId;
    }
    /**
     * @return Unique identifier of the project.
     * 
     */
    public String projectId() {
        return this.projectId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetResourceGroupIncludedScope defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String accountId;
        private String filter;
        private String orgId;
        private String projectId;
        public Builder() {}
        public Builder(GetResourceGroupIncludedScope defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.filter = defaults.filter;
    	      this.orgId = defaults.orgId;
    	      this.projectId = defaults.projectId;
        }

        @CustomType.Setter
        public Builder accountId(String accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder filter(String filter) {
            this.filter = Objects.requireNonNull(filter);
            return this;
        }
        @CustomType.Setter
        public Builder orgId(String orgId) {
            this.orgId = Objects.requireNonNull(orgId);
            return this;
        }
        @CustomType.Setter
        public Builder projectId(String projectId) {
            this.projectId = Objects.requireNonNull(projectId);
            return this;
        }
        public GetResourceGroupIncludedScope build() {
            final var o = new GetResourceGroupIncludedScope();
            o.accountId = accountId;
            o.filter = filter;
            o.orgId = orgId;
            o.projectId = projectId;
            return o;
        }
    }
}
