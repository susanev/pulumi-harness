// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Resource for creating a Harness Resource Group
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = new harness.platform.ResourceGroup("test", {
 *     accountId: "account_id",
 *     allowedScopeLevels: ["account"],
 *     description: "test",
 *     identifier: "identifier",
 *     includedScopes: [{
 *         accountId: "account_id",
 *         filter: "EXCLUDING_CHILD_SCOPES",
 *     }],
 *     resourceFilters: [{
 *         includeAllResources: false,
 *         resources: [{
 *             attributeFilters: [{
 *                 attributeName: "category",
 *                 attributeValues: ["value"],
 *             }],
 *             resourceType: "CONNECTOR",
 *         }],
 *     }],
 *     tags: ["foo:bar"],
 * });
 * ```
 *
 * ## Import
 *
 * Import using resource group id
 *
 * ```sh
 *  $ pulumi import harness:platform/resourceGroup:ResourceGroup example <resource_group_id>
 * ```
 */
export class ResourceGroup extends pulumi.CustomResource {
    /**
     * Get an existing ResourceGroup resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ResourceGroupState, opts?: pulumi.CustomResourceOptions): ResourceGroup {
        return new ResourceGroup(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'harness:platform/resourceGroup:ResourceGroup';

    /**
     * Returns true if the given object is an instance of ResourceGroup.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ResourceGroup {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ResourceGroup.__pulumiType;
    }

    /**
     * Account Identifier of the account
     */
    public readonly accountId!: pulumi.Output<string>;
    /**
     * The scope levels at which this resource group can be used
     */
    public readonly allowedScopeLevels!: pulumi.Output<string[]>;
    /**
     * Color of the environment.
     */
    public readonly color!: pulumi.Output<string>;
    /**
     * Description of the resource.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the resource.
     */
    public readonly identifier!: pulumi.Output<string>;
    /**
     * Included scopes
     */
    public readonly includedScopes!: pulumi.Output<outputs.platform.ResourceGroupIncludedScope[] | undefined>;
    /**
     * Name of the resource.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Unique identifier of the Organization.
     */
    public readonly orgId!: pulumi.Output<string | undefined>;
    /**
     * Unique identifier of the Project.
     */
    public readonly projectId!: pulumi.Output<string | undefined>;
    /**
     * Contains resource filter for a resource group
     */
    public readonly resourceFilters!: pulumi.Output<outputs.platform.ResourceGroupResourceFilter[] | undefined>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    public readonly tags!: pulumi.Output<string[] | undefined>;

    /**
     * Create a ResourceGroup resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ResourceGroupArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ResourceGroupArgs | ResourceGroupState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ResourceGroupState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["allowedScopeLevels"] = state ? state.allowedScopeLevels : undefined;
            resourceInputs["color"] = state ? state.color : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["identifier"] = state ? state.identifier : undefined;
            resourceInputs["includedScopes"] = state ? state.includedScopes : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["orgId"] = state ? state.orgId : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
            resourceInputs["resourceFilters"] = state ? state.resourceFilters : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as ResourceGroupArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.identifier === undefined) && !opts.urn) {
                throw new Error("Missing required property 'identifier'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["allowedScopeLevels"] = args ? args.allowedScopeLevels : undefined;
            resourceInputs["color"] = args ? args.color : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["identifier"] = args ? args.identifier : undefined;
            resourceInputs["includedScopes"] = args ? args.includedScopes : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["orgId"] = args ? args.orgId : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
            resourceInputs["resourceFilters"] = args ? args.resourceFilters : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(ResourceGroup.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ResourceGroup resources.
 */
export interface ResourceGroupState {
    /**
     * Account Identifier of the account
     */
    accountId?: pulumi.Input<string>;
    /**
     * The scope levels at which this resource group can be used
     */
    allowedScopeLevels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Color of the environment.
     */
    color?: pulumi.Input<string>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Included scopes
     */
    includedScopes?: pulumi.Input<pulumi.Input<inputs.platform.ResourceGroupIncludedScope>[]>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Contains resource filter for a resource group
     */
    resourceFilters?: pulumi.Input<pulumi.Input<inputs.platform.ResourceGroupResourceFilter>[]>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}

/**
 * The set of arguments for constructing a ResourceGroup resource.
 */
export interface ResourceGroupArgs {
    /**
     * Account Identifier of the account
     */
    accountId: pulumi.Input<string>;
    /**
     * The scope levels at which this resource group can be used
     */
    allowedScopeLevels?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Color of the environment.
     */
    color?: pulumi.Input<string>;
    /**
     * Description of the resource.
     */
    description?: pulumi.Input<string>;
    /**
     * Unique identifier of the resource.
     */
    identifier: pulumi.Input<string>;
    /**
     * Included scopes
     */
    includedScopes?: pulumi.Input<pulumi.Input<inputs.platform.ResourceGroupIncludedScope>[]>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
    /**
     * Contains resource filter for a resource group
     */
    resourceFilters?: pulumi.Input<pulumi.Input<inputs.platform.ResourceGroupResourceFilter>[]>;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    tags?: pulumi.Input<pulumi.Input<string>[]>;
}
