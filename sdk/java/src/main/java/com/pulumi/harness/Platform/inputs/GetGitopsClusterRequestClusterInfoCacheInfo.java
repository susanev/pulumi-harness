// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.platform.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetGitopsClusterRequestClusterInfoCacheInfo extends com.pulumi.resources.InvokeArgs {

    public static final GetGitopsClusterRequestClusterInfoCacheInfo Empty = new GetGitopsClusterRequestClusterInfoCacheInfo();

    @Import(name="apisCount")
    private @Nullable String apisCount;

    public Optional<String> apisCount() {
        return Optional.ofNullable(this.apisCount);
    }

    @Import(name="lastCacheSyncTime")
    private @Nullable String lastCacheSyncTime;

    public Optional<String> lastCacheSyncTime() {
        return Optional.ofNullable(this.lastCacheSyncTime);
    }

    @Import(name="resourcesCount")
    private @Nullable String resourcesCount;

    public Optional<String> resourcesCount() {
        return Optional.ofNullable(this.resourcesCount);
    }

    private GetGitopsClusterRequestClusterInfoCacheInfo() {}

    private GetGitopsClusterRequestClusterInfoCacheInfo(GetGitopsClusterRequestClusterInfoCacheInfo $) {
        this.apisCount = $.apisCount;
        this.lastCacheSyncTime = $.lastCacheSyncTime;
        this.resourcesCount = $.resourcesCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetGitopsClusterRequestClusterInfoCacheInfo defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetGitopsClusterRequestClusterInfoCacheInfo $;

        public Builder() {
            $ = new GetGitopsClusterRequestClusterInfoCacheInfo();
        }

        public Builder(GetGitopsClusterRequestClusterInfoCacheInfo defaults) {
            $ = new GetGitopsClusterRequestClusterInfoCacheInfo(Objects.requireNonNull(defaults));
        }

        public Builder apisCount(@Nullable String apisCount) {
            $.apisCount = apisCount;
            return this;
        }

        public Builder lastCacheSyncTime(@Nullable String lastCacheSyncTime) {
            $.lastCacheSyncTime = lastCacheSyncTime;
            return this;
        }

        public Builder resourcesCount(@Nullable String resourcesCount) {
            $.resourcesCount = resourcesCount;
            return this;
        }

        public GetGitopsClusterRequestClusterInfoCacheInfo build() {
            return $;
        }
    }

}
