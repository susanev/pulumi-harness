// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs extends com.pulumi.resources.ResourceArgs {

    public static final GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs Empty = new GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs();

    @Import(name="clusterName")
    private @Nullable Output<String> clusterName;

    public Optional<Output<String>> clusterName() {
        return Optional.ofNullable(this.clusterName);
    }

    @Import(name="roleARN")
    private @Nullable Output<String> roleARN;

    public Optional<Output<String>> roleARN() {
        return Optional.ofNullable(this.roleARN);
    }

    private GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs() {}

    private GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs(GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs $) {
        this.clusterName = $.clusterName;
        this.roleARN = $.roleARN;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs $;

        public Builder() {
            $ = new GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs();
        }

        public Builder(GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs defaults) {
            $ = new GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs(Objects.requireNonNull(defaults));
        }

        public Builder clusterName(@Nullable Output<String> clusterName) {
            $.clusterName = clusterName;
            return this;
        }

        public Builder clusterName(String clusterName) {
            return clusterName(Output.of(clusterName));
        }

        public Builder roleARN(@Nullable Output<String> roleARN) {
            $.roleARN = roleARN;
            return this;
        }

        public Builder roleARN(String roleARN) {
            return roleARN(Output.of(roleARN));
        }

        public GetGitopsClusterRequestClusterConfigAwsAuthConfigArgs build() {
            return $;
        }
    }

}
