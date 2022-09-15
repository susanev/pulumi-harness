// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.ApplicationArgs;
import com.pulumi.harness.Utilities;
import com.pulumi.harness.inputs.ApplicationState;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Harness application
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.Application;
 * import com.pulumi.harness.ApplicationArgs;
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
 *         var myapp = new Application(&#34;myapp&#34;, ApplicationArgs.builder()        
 *             .description(&#34;This is my first Harness application&#34;)
 *             .tags(            
 *                 &#34;mytag:myvalue&#34;,
 *                 &#34;team:development&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Import using the Harness application id
 * 
 * ```sh
 *  $ pulumi import harness:index/application:Application myapp Xyz123
 * ```
 * 
 */
@ResourceType(type="harness:index/application:Application")
public class Application extends com.pulumi.resources.CustomResource {
    /**
     * The application description
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The application description
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The id of the git sync connector
     * 
     */
    @Export(name="gitSyncConnectorId", type=String.class, parameters={})
    private Output<String> gitSyncConnectorId;

    /**
     * @return The id of the git sync connector
     * 
     */
    public Output<String> gitSyncConnectorId() {
        return this.gitSyncConnectorId;
    }
    /**
     * True if git sync is enabled on this application
     * 
     */
    @Export(name="gitSyncEnabled", type=Boolean.class, parameters={})
    private Output<Boolean> gitSyncEnabled;

    /**
     * @return True if git sync is enabled on this application
     * 
     */
    public Output<Boolean> gitSyncEnabled() {
        return this.gitSyncEnabled;
    }
    /**
     * When this is set to true, all manual triggers will require API Key authorization
     * 
     */
    @Export(name="isManualTriggerAuthorized", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> isManualTriggerAuthorized;

    /**
     * @return When this is set to true, all manual triggers will require API Key authorization
     * 
     */
    public Output<Optional<Boolean>> isManualTriggerAuthorized() {
        return Codegen.optional(this.isManualTriggerAuthorized);
    }
    /**
     * The name of the application
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the application
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    @Export(name="tags", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> tags;

    /**
     * @return Tags to associate with the resource. Tags should be in the form `name:value`.
     * 
     */
    public Output<Optional<List<String>>> tags() {
        return Codegen.optional(this.tags);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Application(String name) {
        this(name, ApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Application(String name, @Nullable ApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Application(String name, @Nullable ApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/application:Application", name, args == null ? ApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Application(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:index/application:Application", name, state, makeResourceOptions(options, id));
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
    public static Application get(String name, Output<String> id, @Nullable ApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Application(name, id, state, options);
    }
}
