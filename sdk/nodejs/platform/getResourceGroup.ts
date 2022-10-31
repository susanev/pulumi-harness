// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * DataSource for looking up resource group in harness.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const test = pulumi.output(harness.platform.getResourceGroup({
 *     identifier: "identifier",
 * }));
 * ```
 */
export function getResourceGroup(args?: GetResourceGroupArgs, opts?: pulumi.InvokeOptions): Promise<GetResourceGroupResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:platform/getResourceGroup:getResourceGroup", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getResourceGroup.
 */
export interface GetResourceGroupArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the Project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getResourceGroup.
 */
export interface GetResourceGroupResult {
    /**
     * Account Identifier of the account
     */
    readonly accountId: string;
    /**
     * The scope levels at which this resource group can be used
     */
    readonly allowedScopeLevels: string[];
    /**
     * Color of the environment.
     */
    readonly color: string;
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier?: string;
    /**
     * Included scopes
     */
    readonly includedScopes: outputs.platform.GetResourceGroupIncludedScope[];
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the Organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the Project.
     */
    readonly projectId?: string;
    /**
     * Contains resource filter for a resource group
     */
    readonly resourceFilters: outputs.platform.GetResourceGroupResourceFilter[];
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
}

export function getResourceGroupOutput(args?: GetResourceGroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetResourceGroupResult> {
    return pulumi.output(args).apply(a => getResourceGroup(a, opts))
}

/**
 * A collection of arguments for invoking getResourceGroup.
 */
export interface GetResourceGroupOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
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
}
