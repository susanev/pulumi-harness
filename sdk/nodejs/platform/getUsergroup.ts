// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Data source for retrieving a Harness User Group.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as harness from "@pulumi/harness";
 *
 * const exampleById = pulumi.output(harness.platform.getUsergroup({
 *     identifier: "identifier",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * }));
 * const exampleByName = pulumi.output(harness.platform.getUsergroup({
 *     name: "name",
 *     orgId: "org_id",
 *     projectId: "project_id",
 * }));
 * ```
 */
export function getUsergroup(args?: GetUsergroupArgs, opts?: pulumi.InvokeOptions): Promise<GetUsergroupResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("harness:platform/getUsergroup:getUsergroup", {
        "identifier": args.identifier,
        "name": args.name,
        "notificationConfigs": args.notificationConfigs,
        "orgId": args.orgId,
        "projectId": args.projectId,
    }, opts);
}

/**
 * A collection of arguments for invoking getUsergroup.
 */
export interface GetUsergroupArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: string;
    /**
     * Name of the resource.
     */
    name?: string;
    /**
     * List of notification settings.
     */
    notificationConfigs?: inputs.platform.GetUsergroupNotificationConfig[];
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
 * A collection of values returned by getUsergroup.
 */
export interface GetUsergroupResult {
    /**
     * Description of the resource.
     */
    readonly description: string;
    /**
     * Whether the user group is externally managed.
     */
    readonly externallyManaged: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * Unique identifier of the resource.
     */
    readonly identifier?: string;
    /**
     * Name of the linked SSO.
     */
    readonly linkedSsoDisplayName: string;
    /**
     * The SSO account ID that the user group is linked to.
     */
    readonly linkedSsoId: string;
    /**
     * Type of linked SSO
     */
    readonly linkedSsoType: string;
    /**
     * Name of the resource.
     */
    readonly name?: string;
    /**
     * List of notification settings.
     */
    readonly notificationConfigs?: outputs.platform.GetUsergroupNotificationConfig[];
    /**
     * Unique identifier of the Organization.
     */
    readonly orgId?: string;
    /**
     * Unique identifier of the Project.
     */
    readonly projectId?: string;
    /**
     * Identifier of the userGroup in SSO.
     */
    readonly ssoGroupId: string;
    /**
     * Name of the SSO userGroup.
     */
    readonly ssoGroupName: string;
    /**
     * Whether sso is linked or not
     */
    readonly ssoLinked: boolean;
    /**
     * Tags to associate with the resource. Tags should be in the form `name:value`.
     */
    readonly tags: string[];
    /**
     * List of users in the UserGroup.
     */
    readonly users: string[];
}

export function getUsergroupOutput(args?: GetUsergroupOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetUsergroupResult> {
    return pulumi.output(args).apply(a => getUsergroup(a, opts))
}

/**
 * A collection of arguments for invoking getUsergroup.
 */
export interface GetUsergroupOutputArgs {
    /**
     * Unique identifier of the resource.
     */
    identifier?: pulumi.Input<string>;
    /**
     * Name of the resource.
     */
    name?: pulumi.Input<string>;
    /**
     * List of notification settings.
     */
    notificationConfigs?: pulumi.Input<pulumi.Input<inputs.platform.GetUsergroupNotificationConfigArgs>[]>;
    /**
     * Unique identifier of the Organization.
     */
    orgId?: pulumi.Input<string>;
    /**
     * Unique identifier of the Project.
     */
    projectId?: pulumi.Input<string>;
}
