// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Service;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Service.KubernetesArgs;
import com.pulumi.harness.Service.inputs.KubernetesState;
import com.pulumi.harness.Service.outputs.KubernetesVariable;
import com.pulumi.harness.Utilities;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating a Kubernetes service. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.Application;
 * import com.pulumi.harness.Service.Kubernetes;
 * import com.pulumi.harness.Service.KubernetesArgs;
 * import com.pulumi.harness.Service.inputs.KubernetesVariableArgs;
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
 *         var exampleApplication = new Application(&#34;exampleApplication&#34;);
 * 
 *         var exampleKubernetes = new Kubernetes(&#34;exampleKubernetes&#34;, KubernetesArgs.builder()        
 *             .appId(exampleApplication.id())
 *             .helmVersion(&#34;V3&#34;)
 *             .description(&#34;Service for deploying Kubernetes manifests&#34;)
 *             .variables(            
 *                 KubernetesVariableArgs.builder()
 *                     .name(&#34;test&#34;)
 *                     .value(&#34;test_value&#34;)
 *                     .type(&#34;TEXT&#34;)
 *                     .build(),
 *                 KubernetesVariableArgs.builder()
 *                     .name(&#34;test2&#34;)
 *                     .value(&#34;test_value2&#34;)
 *                     .type(&#34;TEXT&#34;)
 *                     .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Import using the Harness application id and service id
 * 
 * ```sh
 *  $ pulumi import harness:Service/kubernetes:Kubernetes example &lt;app_id&gt;/&lt;svc_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:Service/kubernetes:Kubernetes")
public class Kubernetes extends com.pulumi.resources.CustomResource {
    /**
     * The id of the application the service belongs to
     * 
     */
    @Export(name="appId", type=String.class, parameters={})
    private Output<String> appId;

    /**
     * @return The id of the application the service belongs to
     * 
     */
    public Output<String> appId() {
        return this.appId;
    }
    /**
     * Description of th service
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of th service
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The version of Helm to use. Options are `V2` and `V3`. Defaults to &#39;V2&#39;. Only used when `type` is `KUBERNETES` or `HELM`.
     * 
     */
    @Export(name="helmVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> helmVersion;

    /**
     * @return The version of Helm to use. Options are `V2` and `V3`. Defaults to &#39;V2&#39;. Only used when `type` is `KUBERNETES` or `HELM`.
     * 
     */
    public Output<Optional<String>> helmVersion() {
        return Codegen.optional(this.helmVersion);
    }
    /**
     * Name of the service
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return Name of the service
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Variables to be used in the service
     * 
     */
    @Export(name="variables", type=List.class, parameters={KubernetesVariable.class})
    private Output</* @Nullable */ List<KubernetesVariable>> variables;

    /**
     * @return Variables to be used in the service
     * 
     */
    public Output<Optional<List<KubernetesVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Kubernetes(String name) {
        this(name, KubernetesArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Kubernetes(String name, KubernetesArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Kubernetes(String name, KubernetesArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:Service/kubernetes:Kubernetes", name, args == null ? KubernetesArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Kubernetes(String name, Output<String> id, @Nullable KubernetesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:Service/kubernetes:Kubernetes", name, state, makeResourceOptions(options, id));
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
    public static Kubernetes get(String name, Output<String> id, @Nullable KubernetesState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Kubernetes(name, id, state, options);
    }
}
