// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Data source for retrieving a Harness Cluster.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/platform"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err = platform.LookupEnvironmentClustersMapping(ctx, &platform.LookupEnvironmentClustersMappingArgs{
//				Identifier: "identifier",
//				OrgId:      pulumi.StringRef("org_id"),
//				ProjectId:  pulumi.StringRef("project_id"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
func LookupEnvironmentClustersMapping(ctx *pulumi.Context, args *LookupEnvironmentClustersMappingArgs, opts ...pulumi.InvokeOption) (*LookupEnvironmentClustersMappingResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv LookupEnvironmentClustersMappingResult
	err := ctx.Invoke("harness:platform/getEnvironmentClustersMapping:getEnvironmentClustersMapping", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEnvironmentClustersMapping.
type LookupEnvironmentClustersMappingArgs struct {
	// environment identifier of the cluster.
	EnvId string `pulumi:"envId"`
	// identifier of the cluster.
	Identifier string `pulumi:"identifier"`
	// org_id of the cluster.
	OrgId *string `pulumi:"orgId"`
	// project_id of the cluster.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getEnvironmentClustersMapping.
type LookupEnvironmentClustersMappingResult struct {
	// environment identifier of the cluster.
	EnvId string `pulumi:"envId"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// identifier of the cluster.
	Identifier string `pulumi:"identifier"`
	// org_id of the cluster.
	OrgId *string `pulumi:"orgId"`
	// project_id of the cluster.
	ProjectId *string `pulumi:"projectId"`
	// scope at which the cluster exists in harness gitops
	Scope string `pulumi:"scope"`
}

func LookupEnvironmentClustersMappingOutput(ctx *pulumi.Context, args LookupEnvironmentClustersMappingOutputArgs, opts ...pulumi.InvokeOption) LookupEnvironmentClustersMappingResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupEnvironmentClustersMappingResult, error) {
			args := v.(LookupEnvironmentClustersMappingArgs)
			r, err := LookupEnvironmentClustersMapping(ctx, &args, opts...)
			var s LookupEnvironmentClustersMappingResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupEnvironmentClustersMappingResultOutput)
}

// A collection of arguments for invoking getEnvironmentClustersMapping.
type LookupEnvironmentClustersMappingOutputArgs struct {
	// environment identifier of the cluster.
	EnvId pulumi.StringInput `pulumi:"envId"`
	// identifier of the cluster.
	Identifier pulumi.StringInput `pulumi:"identifier"`
	// org_id of the cluster.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// project_id of the cluster.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupEnvironmentClustersMappingOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentClustersMappingArgs)(nil)).Elem()
}

// A collection of values returned by getEnvironmentClustersMapping.
type LookupEnvironmentClustersMappingResultOutput struct{ *pulumi.OutputState }

func (LookupEnvironmentClustersMappingResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupEnvironmentClustersMappingResult)(nil)).Elem()
}

func (o LookupEnvironmentClustersMappingResultOutput) ToLookupEnvironmentClustersMappingResultOutput() LookupEnvironmentClustersMappingResultOutput {
	return o
}

func (o LookupEnvironmentClustersMappingResultOutput) ToLookupEnvironmentClustersMappingResultOutputWithContext(ctx context.Context) LookupEnvironmentClustersMappingResultOutput {
	return o
}

// environment identifier of the cluster.
func (o LookupEnvironmentClustersMappingResultOutput) EnvId() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentClustersMappingResult) string { return v.EnvId }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupEnvironmentClustersMappingResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentClustersMappingResult) string { return v.Id }).(pulumi.StringOutput)
}

// identifier of the cluster.
func (o LookupEnvironmentClustersMappingResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentClustersMappingResult) string { return v.Identifier }).(pulumi.StringOutput)
}

// org_id of the cluster.
func (o LookupEnvironmentClustersMappingResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentClustersMappingResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// project_id of the cluster.
func (o LookupEnvironmentClustersMappingResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupEnvironmentClustersMappingResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// scope at which the cluster exists in harness gitops
func (o LookupEnvironmentClustersMappingResultOutput) Scope() pulumi.StringOutput {
	return o.ApplyT(func(v LookupEnvironmentClustersMappingResult) string { return v.Scope }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupEnvironmentClustersMappingResultOutput{})
}
