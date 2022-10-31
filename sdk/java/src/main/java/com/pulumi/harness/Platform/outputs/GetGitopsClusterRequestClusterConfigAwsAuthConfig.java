// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetGitopsClusterRequestClusterConfigAwsAuthConfig {
    private @Nullable String clusterName;
    private @Nullable String roleARN;

    private GetGitopsClusterRequestClusterConfigAwsAuthConfig() {}
    public Optional<String> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }
    public Optional<String> roleARN() {
        return Optional.ofNullable(this.roleARN);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetGitopsClusterRequestClusterConfigAwsAuthConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String clusterName;
        private @Nullable String roleARN;
        public Builder() {}
        public Builder(GetGitopsClusterRequestClusterConfigAwsAuthConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.clusterName = defaults.clusterName;
    	      this.roleARN = defaults.roleARN;
        }

        @CustomType.Setter
        public Builder clusterName(@Nullable String clusterName) {
            this.clusterName = clusterName;
            return this;
        }
        @CustomType.Setter
        public Builder roleARN(@Nullable String roleARN) {
            this.roleARN = roleARN;
            return this;
        }
        public GetGitopsClusterRequestClusterConfigAwsAuthConfig build() {
            final var o = new GetGitopsClusterRequestClusterConfigAwsAuthConfig();
            o.clusterName = clusterName;
            o.roleARN = roleARN;
            return o;
        }
    }
}
