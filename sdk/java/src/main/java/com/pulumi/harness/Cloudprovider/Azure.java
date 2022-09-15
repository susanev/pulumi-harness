// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.Cloudprovider;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.harness.Cloudprovider.AzureArgs;
import com.pulumi.harness.Cloudprovider.inputs.AzureState;
import com.pulumi.harness.Utilities;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for creating an Azure cloud provider. This resource uses the config-as-code API&#39;s. When updating the `name` or `path` of this resource you should typically also set the `create_before_destroy = true` lifecycle setting.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.harness.HarnessFunctions;
 * import com.pulumi.harness.inputs.GetSecretManagerArgs;
 * import com.pulumi.harness.EncryptedText;
 * import com.pulumi.harness.EncryptedTextArgs;
 * import com.pulumi.harness.Cloudprovider.Azure;
 * import com.pulumi.harness.Cloudprovider.AzureArgs;
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
 *         final var default = HarnessFunctions.getSecretManager(GetSecretManagerArgs.builder()
 *             .default_(true)
 *             .build());
 * 
 *         var azureKey = new EncryptedText(&#34;azureKey&#34;, EncryptedTextArgs.builder()        
 *             .value(&#34;&lt;AZURE_KEY&gt;&#34;)
 *             .secretManagerId(default_.id())
 *             .build());
 * 
 *         var azure = new Azure(&#34;azure&#34;, AzureArgs.builder()        
 *             .clientId(&#34;&lt;AZURE_CLIENT_ID&gt;&#34;)
 *             .tenantId(&#34;&lt;AZURE_TENANT_ID&gt;&#34;)
 *             .key(azureKey.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * # Import using the Harness azure cloud provider id.
 * 
 * ```sh
 *  $ pulumi import harness:Cloudprovider/azure:Azure example &lt;provider_id&gt;
 * ```
 * 
 */
@ResourceType(type="harness:Cloudprovider/azure:Azure")
public class Azure extends com.pulumi.resources.CustomResource {
    /**
     * The client id for the Azure application
     * 
     */
    @Export(name="clientId", type=String.class, parameters={})
    private Output<String> clientId;

    /**
     * @return The client id for the Azure application
     * 
     */
    public Output<String> clientId() {
        return this.clientId;
    }
    /**
     * The type of environment. Valid options are [AZURE AZURE*US*GOVERNMENT]
     * 
     */
    @Export(name="environmentType", type=String.class, parameters={})
    private Output</* @Nullable */ String> environmentType;

    /**
     * @return The type of environment. Valid options are [AZURE AZURE*US*GOVERNMENT]
     * 
     */
    public Output<Optional<String>> environmentType() {
        return Codegen.optional(this.environmentType);
    }
    /**
     * The Name of the Harness secret containing the key for the Azure application
     * 
     */
    @Export(name="key", type=String.class, parameters={})
    private Output<String> key;

    /**
     * @return The Name of the Harness secret containing the key for the Azure application
     * 
     */
    public Output<String> key() {
        return this.key;
    }
    /**
     * The name of the cloud provider.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the cloud provider.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The tenant id for the Azure application
     * 
     */
    @Export(name="tenantId", type=String.class, parameters={})
    private Output<String> tenantId;

    /**
     * @return The tenant id for the Azure application
     * 
     */
    public Output<String> tenantId() {
        return this.tenantId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Azure(String name) {
        this(name, AzureArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Azure(String name, AzureArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Azure(String name, AzureArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:Cloudprovider/azure:Azure", name, args == null ? AzureArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Azure(String name, Output<String> id, @Nullable AzureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("harness:Cloudprovider/azure:Azure", name, state, makeResourceOptions(options, id));
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
    public static Azure get(String name, Output<String> id, @Nullable AzureState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Azure(name, id, state, options);
    }
}
