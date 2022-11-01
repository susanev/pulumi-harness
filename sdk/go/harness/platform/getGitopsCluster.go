// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

func GetGitopsCluster(ctx *pulumi.Context, args *GetGitopsClusterArgs, opts ...pulumi.InvokeOption) (*GetGitopsClusterResult, error) {
	opts = pkgInvokeDefaultOpts(opts)
	var rv GetGitopsClusterResult
	err := ctx.Invoke("harness:platform/getGitopsCluster:getGitopsCluster", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getGitopsCluster.
type GetGitopsClusterArgs struct {
	AccountId  string                    `pulumi:"accountId"`
	AgentId    *string                   `pulumi:"agentId"`
	Identifier string                    `pulumi:"identifier"`
	OrgId      *string                   `pulumi:"orgId"`
	ProjectId  string                    `pulumi:"projectId"`
	Queries    []GetGitopsClusterQuery   `pulumi:"queries"`
	Requests   []GetGitopsClusterRequest `pulumi:"requests"`
}

// A collection of values returned by getGitopsCluster.
type GetGitopsClusterResult struct {
	AccountId string  `pulumi:"accountId"`
	AgentId   *string `pulumi:"agentId"`
	// The provider-assigned unique ID for this managed resource.
	Id         string                    `pulumi:"id"`
	Identifier string                    `pulumi:"identifier"`
	OrgId      *string                   `pulumi:"orgId"`
	ProjectId  string                    `pulumi:"projectId"`
	Queries    []GetGitopsClusterQuery   `pulumi:"queries"`
	Requests   []GetGitopsClusterRequest `pulumi:"requests"`
}

func GetGitopsClusterOutput(ctx *pulumi.Context, args GetGitopsClusterOutputArgs, opts ...pulumi.InvokeOption) GetGitopsClusterResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetGitopsClusterResult, error) {
			args := v.(GetGitopsClusterArgs)
			r, err := GetGitopsCluster(ctx, &args, opts...)
			var s GetGitopsClusterResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetGitopsClusterResultOutput)
}

// A collection of arguments for invoking getGitopsCluster.
type GetGitopsClusterOutputArgs struct {
	AccountId  pulumi.StringInput                `pulumi:"accountId"`
	AgentId    pulumi.StringPtrInput             `pulumi:"agentId"`
	Identifier pulumi.StringInput                `pulumi:"identifier"`
	OrgId      pulumi.StringPtrInput             `pulumi:"orgId"`
	ProjectId  pulumi.StringInput                `pulumi:"projectId"`
	Queries    GetGitopsClusterQueryArrayInput   `pulumi:"queries"`
	Requests   GetGitopsClusterRequestArrayInput `pulumi:"requests"`
}

func (GetGitopsClusterOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsClusterArgs)(nil)).Elem()
}

// A collection of values returned by getGitopsCluster.
type GetGitopsClusterResultOutput struct{ *pulumi.OutputState }

func (GetGitopsClusterResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetGitopsClusterResult)(nil)).Elem()
}

func (o GetGitopsClusterResultOutput) ToGetGitopsClusterResultOutput() GetGitopsClusterResultOutput {
	return o
}

func (o GetGitopsClusterResultOutput) ToGetGitopsClusterResultOutputWithContext(ctx context.Context) GetGitopsClusterResultOutput {
	return o
}

func (o GetGitopsClusterResultOutput) AccountId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) string { return v.AccountId }).(pulumi.StringOutput)
}

func (o GetGitopsClusterResultOutput) AgentId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) *string { return v.AgentId }).(pulumi.StringPtrOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetGitopsClusterResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetGitopsClusterResultOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) string { return v.Identifier }).(pulumi.StringOutput)
}

func (o GetGitopsClusterResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

func (o GetGitopsClusterResultOutput) ProjectId() pulumi.StringOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) string { return v.ProjectId }).(pulumi.StringOutput)
}

func (o GetGitopsClusterResultOutput) Queries() GetGitopsClusterQueryArrayOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) []GetGitopsClusterQuery { return v.Queries }).(GetGitopsClusterQueryArrayOutput)
}

func (o GetGitopsClusterResultOutput) Requests() GetGitopsClusterRequestArrayOutput {
	return o.ApplyT(func(v GetGitopsClusterResult) []GetGitopsClusterRequest { return v.Requests }).(GetGitopsClusterRequestArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetGitopsClusterResultOutput{})
}