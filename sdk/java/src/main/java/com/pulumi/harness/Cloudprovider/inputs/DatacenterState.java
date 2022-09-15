// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Cloudprovider.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.harness.Cloudprovider.inputs.DatacenterUsageScopeArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class DatacenterState extends com.pulumi.resources.ResourceArgs {

    public static final DatacenterState Empty = new DatacenterState();

    /**
     * The name of the cloud provider.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the cloud provider.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    @Import(name="usageScopes")
    private @Nullable Output<List<DatacenterUsageScopeArgs>> usageScopes;

    /**
     * @return This block is used for scoping the resource to a specific set of applications or environments.
     * 
     */
    public Optional<Output<List<DatacenterUsageScopeArgs>>> usageScopes() {
        return Optional.ofNullable(this.usageScopes);
    }

    private DatacenterState() {}

    private DatacenterState(DatacenterState $) {
        this.name = $.name;
        this.usageScopes = $.usageScopes;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(DatacenterState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private DatacenterState $;

        public Builder() {
            $ = new DatacenterState();
        }

        public Builder(DatacenterState defaults) {
            $ = new DatacenterState(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the cloud provider.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the cloud provider.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(@Nullable Output<List<DatacenterUsageScopeArgs>> usageScopes) {
            $.usageScopes = usageScopes;
            return this;
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(List<DatacenterUsageScopeArgs> usageScopes) {
            return usageScopes(Output.of(usageScopes));
        }

        /**
         * @param usageScopes This block is used for scoping the resource to a specific set of applications or environments.
         * 
         * @return builder
         * 
         */
        public Builder usageScopes(DatacenterUsageScopeArgs... usageScopes) {
            return usageScopes(List.of(usageScopes));
        }

        public DatacenterState build() {
            return $;
        }
    }

}
