// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Data source for retrieving service account.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const example = pulumi.output(harness.Platform.getServiceAccount({
 *     identifier: "identifier",
 * }));
 * ```
 */
export function getServiceAccount(args?: GetServiceAccountArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceAccountResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:Platform/getServiceAccount:getServiceAccount", {
        "identifier": args.identifier,
        "name": args.name,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * Unique identifier of the organization.
     */
    orgId?: string;
    /**
     * Unique identifier of the project.
     */
    projectId?: string;
}

/**
 * A collection of values returned by getServiceAccount.
 */
export interface GetServiceAccountResult {
    /**
     * Account Identifier for the Entity.
     */
    readonly accountId: string;
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * Email of the Service Account.
     */
    readonly email: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier?: string;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * Unique identifier of the organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the project.
     */
    readonly projectId?: string;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
}

export function getServiceAccountOutput(args?: GetServiceAccountOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceAccountResult> {
    return pulumi.output(args).apply(a => getServiceAccount(a, opts))
}

/**
 * A collection of arguments for invoking getServiceAccount.
 */
export interface GetServiceAccountOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * Unique identifier of the organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the project.
     */
    projectId?: pulumi.Input<string>;
}
