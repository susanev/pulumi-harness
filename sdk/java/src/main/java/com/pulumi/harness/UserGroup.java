// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.UserGroupArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.UserGroupState;
import com.pulumi.harness.outputs.UserGroupLdapSettings;
import com.pulumi.harness.outputs.UserGroupNotificationSettings;
import com.pulumi.harness.outputs.UserGroupPermissions;
import com.pulumi.harness.outputs.UserGroupSamlSettings;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness user group
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.UserGroup;
 * import com.pulumi.harness.UserGroupArgs;
 * import com.pulumi.harness.inputs.UserGroupPermissionsArgs;
 * import com.pulumi.harness.inputs.UserGroupPermissionsAppPermissionsArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var example = new UserGroup(&#34;example&#34;, UserGroupArgs.builder()        
 *             .description(&#34;This group demonstrates account level and resource level permissions.&#34;)
 *             .permissions(UserGroupPermissionsArgs.builder()
 *                 .accountPermissions(                
 *                     &#34;ADMINISTER_OTHER_ACCOUNT_FUNCTIONS&#34;,
 *                     &#34;MANAGE_API_KEYS&#34;)
 *                 .appPermissions(UserGroupPermissionsAppPermissionsArgs.builder()
 *                     .all(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .deployment(                    
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .environment(                    
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .pipeline(                    
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .provisioner(                    
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .service(                    
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .template(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .workflow(                    
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                         %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Import using the id of the user group
 * 
 * ```sh
 *  $ pulumi import harness:index/userGroup:UserGroup example &lt;USER_GROUP_ID&gt;
 * ```
 * 
 */
@ResourceType(type="harness:index/userGroup:UserGroup")
public class UserGroup extends com.pulumi.resources.CustomResource {
    /**
     * The description of the user group.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the user group.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Indicates whether the user group was imported by SCIM.
     * 
     */
    @Export(name="importedByScim", type=Boolean.class, parameters={})
    private Output<Boolean> importedByScim;

    /**
     * @return Indicates whether the user group was imported by SCIM.
     * 
     */
    public Output<Boolean> importedByScim() {
        return this.importedByScim;
    }
    /**
     * Indicates whether the user group is linked to an SSO provider.
     * 
     */
    @Export(name="isSsoLinked", type=Boolean.class, parameters={})
    private Output<Boolean> isSsoLinked;

    /**
     * @return Indicates whether the user group is linked to an SSO provider.
     * 
     */
    public Output<Boolean> isSsoLinked() {
        return this.isSsoLinked;
    }
    /**
     * The LDAP settings for the user group.
     * 
     */
    @Export(name="ldapSettings", type=UserGroupLdapSettings.class, parameters={})
    private Output</* @Nullable */ UserGroupLdapSettings> ldapSettings;

    /**
     * @return The LDAP settings for the user group.
     * 
     */
    public Output<Optional<UserGroupLdapSettings>> ldapSettings() {
        return Codegen.optional(this.ldapSettings);
    }
    /**
     * The name of the user group.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the user group.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The notification settings of the user group.
     * 
     */
    @Export(name="notificationSettings", type=UserGroupNotificationSettings.class, parameters={})
    private Output</* @Nullable */ UserGroupNotificationSettings> notificationSettings;

    /**
     * @return The notification settings of the user group.
     * 
     */
    public Output<Optional<UserGroupNotificationSettings>> notificationSettings() {
        return Codegen.optional(this.notificationSettings);
    }
    /**
     * The permissions of the user group.
     * 
     */
    @Export(name="permissions", type=UserGroupPermissions.class, parameters={})
    private Output</* @Nullable */ UserGroupPermissions> permissions;

    /**
     * @return The permissions of the user group.
     * 
     */
    public Output<Optional<UserGroupPermissions>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * The SAML settings for the user group.
     * 
     */
    @Export(name="samlSettings", type=UserGroupSamlSettings.class, parameters={})
    private Output</* @Nullable */ UserGroupSamlSettings> samlSettings;

    /**
     * @return The SAML settings for the user group.
     * 
     */
    public Output<Optional<UserGroupSamlSettings>> samlSettings() {
        return Codegen.optional(this.samlSettings);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public UserGroup(String name) {
        this(name, UserGroupArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public UserGroup(String name, @Nullable UserGroupArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public UserGroup(String name, @Nullable UserGroupArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/userGroup:UserGroup", name, args == null ? UserGroupArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private UserGroup(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/userGroup:UserGroup", name, state, makeResourceOptions(options, id));
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
    public static UserGroup get(String name, Output<String> id, @Nullable UserGroupState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new UserGroup(name, id, state, options);
    }
}
