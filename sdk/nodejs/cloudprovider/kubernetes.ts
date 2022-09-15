// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Resource for creating a Kubernetes cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@lbrlabs/pulumi-harness";
 * import * as harness from "@pulumi/harness";
 *
 * const default = harness.getSecretManager({
 *     "default": true,
 * });
 * const username = new harness.EncryptedText("username", {
 *     value: "<USERNAME>",
 *     secretManagerId: _default.then(_default => _default.id),
 * });
 * const password = new harness.EncryptedText("password", {
 *     value: "<PASSWORD>",
 *     secretManagerId: _default.then(_default => _default.id),
 * });
 * const example = new harness.cloudprovider.Kubernetes("example", {
 *     skipValidation: true,
 *     authentication: {
 *         usernamePassword: {
 *             masterUrl: "https://localhost.com",
 *             usernameSecretName: username.name,
 *             passwordSecretName: password.name,
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * # Import using the Harness kubernetes cloud provider id.
 *
 * ```sh
 *  $ pulumi import harness:Cloudprovider/kubernetes:Kubernetes example <provider_id>
 * ```
 */
export class Kubernetes extends pulumi.CustomResource {
    /**
     * Get an existing Kubernetes resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: KubernetesState, opts?: pulumi.CustomResourceOptions): Kubernetes {
        return new Kubernetes(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:Cloudprovider/kubernetes:Kubernetes';

    /**
     * Returns true if the given object is an instance of Kubernetes.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Kubernetes {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Kubernetes.__pulumiType;
    }

    /**
     * Authentication configuration for the Kubernetes cluster
     */
    public readonly authentication!: pulumi.Output<outputs.Cloudprovider.KubernetesAuthentication>;
    /**
     * The name of the cloud provider.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Skip validation of Kubernetes configuration.
     */
    public readonly skipValidation!: pulumi.Output<boolean | undefined>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    public readonly usageScopes!: pulumi.Output<outputs.Cloudprovider.KubernetesUsageScope[] | undefined>;

    /**
     * Create a Kubernetes resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: KubernetesArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: KubernetesArgs | KubernetesState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as KubernetesState | undefined;
            resourceInputs["authentication"] = state ? state.authentication : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["skipValidation"] = state ? state.skipValidation : undefined;
            resourceInputs["usageScopes"] = state ? state.usageScopes : undefined;
        } else {
            const args = argsOrState as KubernetesArgs | undefined;
            if ((!args || args.authentication === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authentication'");
            }
            resourceInputs["authentication"] = args ? args.authentication : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["skipValidation"] = args ? args.skipValidation : undefined;
            resourceInputs["usageScopes"] = args ? args.usageScopes : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Kubernetes.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Kubernetes resources.
 */
export interface KubernetesState {
    /**
     * Authentication configuration for the Kubernetes cluster
     */
    authentication?: pulumi.Input<inputs.Cloudprovider.KubernetesAuthentication>;
    /**
     * The name of the cloud provider.
     */
    name?: pulumi.Input<string>;
    /**
     * Skip validation of Kubernetes configuration.
     */
    skipValidation?: pulumi.Input<boolean>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.Cloudprovider.KubernetesUsageScope>[]>;
}

/**
 * The set of arguments for constructing a Kubernetes resource.
 */
export interface KubernetesArgs {
    /**
     * Authentication configuration for the Kubernetes cluster
     */
    authentication: pulumi.Input<inputs.Cloudprovider.KubernetesAuthentication>;
    /**
     * The name of the cloud provider.
     */
    name?: pulumi.Input<string>;
    /**
     * Skip validation of Kubernetes configuration.
     */
    skipValidation?: pulumi.Input<boolean>;
    /**
     * This block is used for scoping the resource to a specific set of applications or environments.
     */
    usageScopes?: pulumi.Input<pulumi.Input<inputs.Cloudprovider.KubernetesUsageScope>[]>;
}
