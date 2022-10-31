// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.UserGroupPermissionsArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.UserGroupPermissionsState;
import com.pulumi.harness.outputs.UserGroupPermissionsAppPermissions;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for adding permissions to an existing Harness user group.
 * 
 */
@ResourceType(type="harness:index/userGroupPermissions:UserGroupPermissions")
public class UserGroupPermissions extends com.pulumi.resources.CustomResource {
    /**
     * The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
     * 
     */
    @Export(name="accountPermissions", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> accountPermissions;

    /**
     * @return The account permissions of the user group. Valid options are ADMINISTER*OTHER*ACCOUNT*FUNCTIONS, CREATE*AND*DELETE*APPLICATION, CREATE*CUSTOM*DASHBOARDS, MANAGE*ALERT*NOTIFICATION*RULES, MANAGE*API*KEYS, MANAGE*APPLICATION*STACKS, MANAGE*AUTHENTICATION*SETTINGS, MANAGE*CLOUD*PROVIDERS, MANAGE*CONFIG*AS*CODE, MANAGE*CONNECTORS, MANAGE*CUSTOM*DASHBOARDS, MANAGE*DELEGATE*PROFILES, MANAGE*DELEGATES, MANAGE*DEPLOYMENT*FREEZES, MANAGE*IP*WHITELIST, MANAGE*PIPELINE*GOVERNANCE*STANDARDS, MANAGE*RESTRICTED*ACCESS, MANAGE*SECRET*MANAGERS, MANAGE*SECRETS, MANAGE*SSH*AND*WINRM, MANAGE*TAGS, MANAGE*TEMPLATE*LIBRARY, MANAGE*USER*AND*USER*GROUPS*AND*API*KEYS, MANAGE*USERS*AND*GROUPS, READ*USERS*AND*GROUPS, VIEW*AUDITS, VIEW*USER*AND*USER*GROUPS*AND*API_KEYS
     * 
     */
    public Output<Optional<List<String>>> accountPermissions() {
        return Codegen.optional(this.accountPermissions);
    }
    /**
     * Application specific permissions
     * 
     */
    @Export(name="appPermissions", type=UserGroupPermissionsAppPermissions.class, parameters={})
    private Output</* @Nullable */ UserGroupPermissionsAppPermissions> appPermissions;

    /**
     * @return Application specific permissions
     * 
     */
    public Output<Optional<UserGroupPermissionsAppPermissions>> appPermissions() {
        return Codegen.optional(this.appPermissions);
    }
    /**
     * Unique identifier of the user group.
     * 
     */
    @Export(name="userGroupId", type=String.class, parameters={})
    private Output<String> userGroupId;

    /**
     * @return Unique identifier of the user group.
     * 
     */
    public Output<String> userGroupId() {
        return this.userGroupId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGroupPermissions(String name) {
        this(name, UserGroupPermissionsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGroupPermissions(String name, UserGroupPermissionsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGroupPermissions(String name, UserGroupPermissionsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/userGroupPermissions:UserGroupPermissions", name, args == null ? UserGroupPermissionsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroupPermissions(String name, Output<String> id, @Nullable UserGroupPermissionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/userGroupPermissions:UserGroupPermissions", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static UserGroupPermissions get(String name, Output<String> id, @Nullable UserGroupPermissionsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGroupPermissions(name, id, state, options);
    }
}
