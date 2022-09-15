// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platformconnector

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Datasource for looking up an AWS connector.
func LookupAws(ctx *pulumi.Context, args *LookupAwsArgs, opts ...pulumi.InvokeOption) (*LookupAwsResult, error) {
	var rv LookupAwsResult
	err := ctx.Invoke("harness:PlatformConnector/getAws:getAws", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAws.
type LookupAwsArgs struct {
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
}

// A collection of values returned by getAws.
type LookupAwsResult struct {
	// Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
	CrossAccountAccesses []GetAwsCrossAccountAccess `pulumi:"crossAccountAccesses"`
	// Description of the resource.
	Description string `pulumi:"description"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Inherit credentials from the delegate.
	InheritFromDelegates []GetAwsInheritFromDelegate `pulumi:"inheritFromDelegates"`
	// Use IAM role for service accounts.
	Irsas []GetAwsIrsa `pulumi:"irsas"`
	// Use IAM role for service accounts.
	Manuals []GetAwsManual `pulumi:"manuals"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
}

func LookupAwsOutput(ctx *pulumi.Context, args LookupAwsOutputArgs, opts ...pulumi.InvokeOption) LookupAwsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (LookupAwsResult, error) {
			args := v.(LookupAwsArgs)
			r, err := LookupAws(ctx, &args, opts...)
			var s LookupAwsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(LookupAwsResultOutput)
}

// A collection of arguments for invoking getAws.
type LookupAwsOutputArgs struct {
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringPtrInput `pulumi:"name"`
	// Unique identifier of the organization.
	OrgId pulumi.StringPtrInput `pulumi:"orgId"`
	// Unique identifier of the project.
	ProjectId pulumi.StringPtrInput `pulumi:"projectId"`
}

func (LookupAwsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsArgs)(nil)).Elem()
}

// A collection of values returned by getAws.
type LookupAwsResultOutput struct{ *pulumi.OutputState }

func (LookupAwsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LookupAwsResult)(nil)).Elem()
}

func (o LookupAwsResultOutput) ToLookupAwsResultOutput() LookupAwsResultOutput {
	return o
}

func (o LookupAwsResultOutput) ToLookupAwsResultOutputWithContext(ctx context.Context) LookupAwsResultOutput {
	return o
}

// Select this option if you want to use one AWS account for the connection, but you want to deploy or build in a different AWS account. In this scenario, the AWS account used for AWS access in Credentials will assume the IAM role you specify in Cross-account role ARN setting. This option uses the AWS Security Token Service (STS) feature.
func (o LookupAwsResultOutput) CrossAccountAccesses() GetAwsCrossAccountAccessArrayOutput {
	return o.ApplyT(func(v LookupAwsResult) []GetAwsCrossAccountAccess { return v.CrossAccountAccesses }).(GetAwsCrossAccountAccessArrayOutput)
}

// Description of the resource.
func (o LookupAwsResultOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsResult) string { return v.Description }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o LookupAwsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v LookupAwsResult) string { return v.Id }).(pulumi.StringOutput)
}

// Unique identifier of the resource.
func (o LookupAwsResultOutput) Identifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsResult) *string { return v.Identifier }).(pulumi.StringPtrOutput)
}

// Inherit credentials from the delegate.
func (o LookupAwsResultOutput) InheritFromDelegates() GetAwsInheritFromDelegateArrayOutput {
	return o.ApplyT(func(v LookupAwsResult) []GetAwsInheritFromDelegate { return v.InheritFromDelegates }).(GetAwsInheritFromDelegateArrayOutput)
}

// Use IAM role for service accounts.
func (o LookupAwsResultOutput) Irsas() GetAwsIrsaArrayOutput {
	return o.ApplyT(func(v LookupAwsResult) []GetAwsIrsa { return v.Irsas }).(GetAwsIrsaArrayOutput)
}

// Use IAM role for service accounts.
func (o LookupAwsResultOutput) Manuals() GetAwsManualArrayOutput {
	return o.ApplyT(func(v LookupAwsResult) []GetAwsManual { return v.Manuals }).(GetAwsManualArrayOutput)
}

// Name of the resource.
func (o LookupAwsResultOutput) Name() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsResult) *string { return v.Name }).(pulumi.StringPtrOutput)
}

// Unique identifier of the organization.
func (o LookupAwsResultOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsResult) *string { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the project.
func (o LookupAwsResultOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v LookupAwsResult) *string { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o LookupAwsResultOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v LookupAwsResult) []string { return v.Tags }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(LookupAwsResultOutput{})
}
