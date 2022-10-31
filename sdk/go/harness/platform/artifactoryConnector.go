// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package platform

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an Artifactory connector.
type ArtifactoryConnector struct {
	pulumi.CustomResourceState

	// Credentials to use for authentication.
	Credentials ArtifactoryConnectorCredentialsPtrOutput `pulumi:"credentials"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors pulumi.StringArrayOutput `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Name of the resource.
	Name pulumi.StringOutput `pulumi:"name"`
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrOutput `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrOutput `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayOutput `pulumi:"tags"`
	// URL of the Artifactory server.
	Url pulumi.StringOutput `pulumi:"url"`
}

// NewArtifactoryConnector registers a new resource with the given unique name, arguments, and options.
func NewArtifactoryConnector(ctx *pulumi.Context,
	name string, args *ArtifactoryConnectorArgs, opts ...pulumi.ResourceOption) (*ArtifactoryConnector, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Identifier == nil {
		return nil, errors.New("invalid value for required argument 'Identifier'")
	}
	if args.Url == nil {
		return nil, errors.New("invalid value for required argument 'Url'")
	}
	opts = pkgResourceDefaultOpts(opts)
	var resource ArtifactoryConnector
	err := ctx.RegisterResource("harness:platform/artifactoryConnector:ArtifactoryConnector", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetArtifactoryConnector gets an existing ArtifactoryConnector resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetArtifactoryConnector(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ArtifactoryConnectorState, opts ...pulumi.ResourceOption) (*ArtifactoryConnector, error) {
	var resource ArtifactoryConnector
	err := ctx.ReadResource("harness:platform/artifactoryConnector:ArtifactoryConnector", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ArtifactoryConnector resources.
type artifactoryConnectorState struct {
	// Credentials to use for authentication.
	Credentials *ArtifactoryConnectorCredentials `pulumi:"credentials"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier *string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the Organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// URL of the Artifactory server.
	Url *string `pulumi:"url"`
}

type ArtifactoryConnectorState struct {
	// Credentials to use for authentication.
	Credentials ArtifactoryConnectorCredentialsPtrInput
	// Connect using only the delegates which have these tags.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringPtrInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// URL of the Artifactory server.
	Url pulumi.StringPtrInput
}

func (ArtifactoryConnectorState) ElementType() reflect.Type {
	return reflect.TypeOf((*artifactoryConnectorState)(nil)).Elem()
}

type artifactoryConnectorArgs struct {
	// Credentials to use for authentication.
	Credentials *ArtifactoryConnectorCredentials `pulumi:"credentials"`
	// Connect using only the delegates which have these tags.
	DelegateSelectors []string `pulumi:"delegateSelectors"`
	// Description of the resource.
	Description *string `pulumi:"description"`
	// Unique identifier of the resource.
	Identifier string `pulumi:"identifier"`
	// Name of the resource.
	Name *string `pulumi:"name"`
	// Unique identifier of the Organization.
	OrgId *string `pulumi:"orgId"`
	// Unique identifier of the Project.
	ProjectId *string `pulumi:"projectId"`
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags []string `pulumi:"tags"`
	// URL of the Artifactory server.
	Url string `pulumi:"url"`
}

// The set of arguments for constructing a ArtifactoryConnector resource.
type ArtifactoryConnectorArgs struct {
	// Credentials to use for authentication.
	Credentials ArtifactoryConnectorCredentialsPtrInput
	// Connect using only the delegates which have these tags.
	DelegateSelectors pulumi.StringArrayInput
	// Description of the resource.
	Description pulumi.StringPtrInput
	// Unique identifier of the resource.
	Identifier pulumi.StringInput
	// Name of the resource.
	Name pulumi.StringPtrInput
	// Unique identifier of the Organization.
	OrgId pulumi.StringPtrInput
	// Unique identifier of the Project.
	ProjectId pulumi.StringPtrInput
	// Tags to associate with the resource. Tags should be in the form `name:value`.
	Tags pulumi.StringArrayInput
	// URL of the Artifactory server.
	Url pulumi.StringInput
}

func (ArtifactoryConnectorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*artifactoryConnectorArgs)(nil)).Elem()
}

type ArtifactoryConnectorInput interface {
	pulumi.Input

	ToArtifactoryConnectorOutput() ArtifactoryConnectorOutput
	ToArtifactoryConnectorOutputWithContext(ctx context.Context) ArtifactoryConnectorOutput
}

func (*ArtifactoryConnector) ElementType() reflect.Type {
	return reflect.TypeOf((**ArtifactoryConnector)(nil)).Elem()
}

func (i *ArtifactoryConnector) ToArtifactoryConnectorOutput() ArtifactoryConnectorOutput {
	return i.ToArtifactoryConnectorOutputWithContext(context.Background())
}

func (i *ArtifactoryConnector) ToArtifactoryConnectorOutputWithContext(ctx context.Context) ArtifactoryConnectorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArtifactoryConnectorOutput)
}

// ArtifactoryConnectorArrayInput is an input type that accepts ArtifactoryConnectorArray and ArtifactoryConnectorArrayOutput values.
// You can construct a concrete instance of `ArtifactoryConnectorArrayInput` via:
//
//	ArtifactoryConnectorArray{ ArtifactoryConnectorArgs{...} }
type ArtifactoryConnectorArrayInput interface {
	pulumi.Input

	ToArtifactoryConnectorArrayOutput() ArtifactoryConnectorArrayOutput
	ToArtifactoryConnectorArrayOutputWithContext(context.Context) ArtifactoryConnectorArrayOutput
}

type ArtifactoryConnectorArray []ArtifactoryConnectorInput

func (ArtifactoryConnectorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ArtifactoryConnector)(nil)).Elem()
}

func (i ArtifactoryConnectorArray) ToArtifactoryConnectorArrayOutput() ArtifactoryConnectorArrayOutput {
	return i.ToArtifactoryConnectorArrayOutputWithContext(context.Background())
}

func (i ArtifactoryConnectorArray) ToArtifactoryConnectorArrayOutputWithContext(ctx context.Context) ArtifactoryConnectorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArtifactoryConnectorArrayOutput)
}

// ArtifactoryConnectorMapInput is an input type that accepts ArtifactoryConnectorMap and ArtifactoryConnectorMapOutput values.
// You can construct a concrete instance of `ArtifactoryConnectorMapInput` via:
//
//	ArtifactoryConnectorMap{ "key": ArtifactoryConnectorArgs{...} }
type ArtifactoryConnectorMapInput interface {
	pulumi.Input

	ToArtifactoryConnectorMapOutput() ArtifactoryConnectorMapOutput
	ToArtifactoryConnectorMapOutputWithContext(context.Context) ArtifactoryConnectorMapOutput
}

type ArtifactoryConnectorMap map[string]ArtifactoryConnectorInput

func (ArtifactoryConnectorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ArtifactoryConnector)(nil)).Elem()
}

func (i ArtifactoryConnectorMap) ToArtifactoryConnectorMapOutput() ArtifactoryConnectorMapOutput {
	return i.ToArtifactoryConnectorMapOutputWithContext(context.Background())
}

func (i ArtifactoryConnectorMap) ToArtifactoryConnectorMapOutputWithContext(ctx context.Context) ArtifactoryConnectorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ArtifactoryConnectorMapOutput)
}

type ArtifactoryConnectorOutput struct{ *pulumi.OutputState }

func (ArtifactoryConnectorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ArtifactoryConnector)(nil)).Elem()
}

func (o ArtifactoryConnectorOutput) ToArtifactoryConnectorOutput() ArtifactoryConnectorOutput {
	return o
}

func (o ArtifactoryConnectorOutput) ToArtifactoryConnectorOutputWithContext(ctx context.Context) ArtifactoryConnectorOutput {
	return o
}

// Credentials to use for authentication.
func (o ArtifactoryConnectorOutput) Credentials() ArtifactoryConnectorCredentialsPtrOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) ArtifactoryConnectorCredentialsPtrOutput { return v.Credentials }).(ArtifactoryConnectorCredentialsPtrOutput)
}

// Connect using only the delegates which have these tags.
func (o ArtifactoryConnectorOutput) DelegateSelectors() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) pulumi.StringArrayOutput { return v.DelegateSelectors }).(pulumi.StringArrayOutput)
}

// Description of the resource.
func (o ArtifactoryConnectorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Unique identifier of the resource.
func (o ArtifactoryConnectorOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Name of the resource.
func (o ArtifactoryConnectorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Unique identifier of the Organization.
func (o ArtifactoryConnectorOutput) OrgId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) pulumi.StringPtrOutput { return v.OrgId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the Project.
func (o ArtifactoryConnectorOutput) ProjectId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) pulumi.StringPtrOutput { return v.ProjectId }).(pulumi.StringPtrOutput)
}

// Tags to associate with the resource. Tags should be in the form `name:value`.
func (o ArtifactoryConnectorOutput) Tags() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) pulumi.StringArrayOutput { return v.Tags }).(pulumi.StringArrayOutput)
}

// URL of the Artifactory server.
func (o ArtifactoryConnectorOutput) Url() pulumi.StringOutput {
	return o.ApplyT(func(v *ArtifactoryConnector) pulumi.StringOutput { return v.Url }).(pulumi.StringOutput)
}

type ArtifactoryConnectorArrayOutput struct{ *pulumi.OutputState }

func (ArtifactoryConnectorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ArtifactoryConnector)(nil)).Elem()
}

func (o ArtifactoryConnectorArrayOutput) ToArtifactoryConnectorArrayOutput() ArtifactoryConnectorArrayOutput {
	return o
}

func (o ArtifactoryConnectorArrayOutput) ToArtifactoryConnectorArrayOutputWithContext(ctx context.Context) ArtifactoryConnectorArrayOutput {
	return o
}

func (o ArtifactoryConnectorArrayOutput) Index(i pulumi.IntInput) ArtifactoryConnectorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ArtifactoryConnector {
		return vs[0].([]*ArtifactoryConnector)[vs[1].(int)]
	}).(ArtifactoryConnectorOutput)
}

type ArtifactoryConnectorMapOutput struct{ *pulumi.OutputState }

func (ArtifactoryConnectorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ArtifactoryConnector)(nil)).Elem()
}

func (o ArtifactoryConnectorMapOutput) ToArtifactoryConnectorMapOutput() ArtifactoryConnectorMapOutput {
	return o
}

func (o ArtifactoryConnectorMapOutput) ToArtifactoryConnectorMapOutputWithContext(ctx context.Context) ArtifactoryConnectorMapOutput {
	return o
}

func (o ArtifactoryConnectorMapOutput) MapIndex(k pulumi.StringInput) ArtifactoryConnectorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ArtifactoryConnector {
		return vs[0].(map[string]*ArtifactoryConnector)[vs[1].(string)]
	}).(ArtifactoryConnectorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ArtifactoryConnectorInput)(nil)).Elem(), &ArtifactoryConnector{})
	pulumi.RegisterInputType(reflect.TypeOf((*ArtifactoryConnectorArrayInput)(nil)).Elem(), ArtifactoryConnectorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ArtifactoryConnectorMapInput)(nil)).Elem(), ArtifactoryConnectorMap{})
	pulumi.RegisterOutputType(ArtifactoryConnectorOutput{})
	pulumi.RegisterOutputType(ArtifactoryConnectorArrayOutput{})
	pulumi.RegisterOutputType(ArtifactoryConnectorMapOutput{})
}
