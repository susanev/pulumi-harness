// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloudprovider

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an Azure cloud provider. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness"
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/Cloudprovider"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_default, err := harness.GetSecretManager(ctx, &GetSecretManagerArgs{
//				Default: pulumi.BoolRef(true),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			azureKey, err := harness.NewEncryptedText(ctx, "azureKey", &harness.EncryptedTextArgs{
//				Value:           pulumi.String("<AZURE_KEY>"),
//				SecretManagerId: pulumi.String(_default.Id),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = Cloudprovider.NewAzure(ctx, "azure", &Cloudprovider.AzureArgs{
//				ClientId: pulumi.String("<AZURE_CLIENT_ID>"),
//				TenantId: pulumi.String("<AZURE_TENANT_ID>"),
//				Key:      azureKey.Name,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # Import using the Harness azure cloud provider id.
//
// ```sh
//
//	$ pulumi import harness:Cloudprovider/azure:Azure example <provider_id>
//
// ```
type Azure struct {
	pulumi.CustomResourceState

	// The client id for the Azure application
	ClientId pulumi.StringOutput `pulumi:"clientId"`
	// The type of environment. Valid options are [AZURE AZURE*US*GOVERNMENT]
	EnvironmentType pulumi.StringPtrOutput `pulumi:"environmentType"`
	// The Name of the Harness secret containing the key for the Azure application
	Key pulumi.StringOutput `pulumi:"key"`
	// The name of the cloud provider.
	Name pulumi.StringOutput `pulumi:"name"`
	// The tenant id for the Azure application
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
}

// NewAzure registers a new resource with the given unique name, arguments, and options.
func NewAzure(ctx *pulumi.Context,
	name string, args *AzureArgs, opts ...pulumi.ResourceOption) (*Azure, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClientId == nil {
		return nil, errors.New("invalid value for required argument 'ClientId'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	if args.TenantId == nil {
		return nil, errors.New("invalid value for required argument 'TenantId'")
	}
	var resource Azure
	err := ctx.RegisterResource("harness:Cloudprovider/azure:Azure", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAzure gets an existing Azure resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAzure(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AzureState, opts ...pulumi.ResourceOption) (*Azure, error) {
	var resource Azure
	err := ctx.ReadResource("harness:Cloudprovider/azure:Azure", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Azure resources.
type azureState struct {
	// The client id for the Azure application
	ClientId *string `pulumi:"clientId"`
	// The type of environment. Valid options are [AZURE AZURE*US*GOVERNMENT]
	EnvironmentType *string `pulumi:"environmentType"`
	// The Name of the Harness secret containing the key for the Azure application
	Key *string `pulumi:"key"`
	// The name of the cloud provider.
	Name *string `pulumi:"name"`
	// The tenant id for the Azure application
	TenantId *string `pulumi:"tenantId"`
}

type AzureState struct {
	// The client id for the Azure application
	ClientId pulumi.StringPtrInput
	// The type of environment. Valid options are [AZURE AZURE*US*GOVERNMENT]
	EnvironmentType pulumi.StringPtrInput
	// The Name of the Harness secret containing the key for the Azure application
	Key pulumi.StringPtrInput
	// The name of the cloud provider.
	Name pulumi.StringPtrInput
	// The tenant id for the Azure application
	TenantId pulumi.StringPtrInput
}

func (AzureState) ElementType() reflect.Type {
	return reflect.TypeOf((*azureState)(nil)).Elem()
}

type azureArgs struct {
	// The client id for the Azure application
	ClientId string `pulumi:"clientId"`
	// The type of environment. Valid options are [AZURE AZURE*US*GOVERNMENT]
	EnvironmentType *string `pulumi:"environmentType"`
	// The Name of the Harness secret containing the key for the Azure application
	Key string `pulumi:"key"`
	// The name of the cloud provider.
	Name *string `pulumi:"name"`
	// The tenant id for the Azure application
	TenantId string `pulumi:"tenantId"`
}

// The set of arguments for constructing a Azure resource.
type AzureArgs struct {
	// The client id for the Azure application
	ClientId pulumi.StringInput
	// The type of environment. Valid options are [AZURE AZURE*US*GOVERNMENT]
	EnvironmentType pulumi.StringPtrInput
	// The Name of the Harness secret containing the key for the Azure application
	Key pulumi.StringInput
	// The name of the cloud provider.
	Name pulumi.StringPtrInput
	// The tenant id for the Azure application
	TenantId pulumi.StringInput
}

func (AzureArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*azureArgs)(nil)).Elem()
}

type AzureInput interface {
	pulumi.Input

	ToAzureOutput() AzureOutput
	ToAzureOutputWithContext(ctx context.Context) AzureOutput
}

func (*Azure) ElementType() reflect.Type {
	return reflect.TypeOf((**Azure)(nil)).Elem()
}

func (i *Azure) ToAzureOutput() AzureOutput {
	return i.ToAzureOutputWithContext(context.Background())
}

func (i *Azure) ToAzureOutputWithContext(ctx context.Context) AzureOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureOutput)
}

// AzureArrayInput is an input type that accepts AzureArray and AzureArrayOutput values.
// You can construct a concrete instance of `AzureArrayInput` via:
//
//	AzureArray{ AzureArgs{...} }
type AzureArrayInput interface {
	pulumi.Input

	ToAzureArrayOutput() AzureArrayOutput
	ToAzureArrayOutputWithContext(context.Context) AzureArrayOutput
}

type AzureArray []AzureInput

func (AzureArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Azure)(nil)).Elem()
}

func (i AzureArray) ToAzureArrayOutput() AzureArrayOutput {
	return i.ToAzureArrayOutputWithContext(context.Background())
}

func (i AzureArray) ToAzureArrayOutputWithContext(ctx context.Context) AzureArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureArrayOutput)
}

// AzureMapInput is an input type that accepts AzureMap and AzureMapOutput values.
// You can construct a concrete instance of `AzureMapInput` via:
//
//	AzureMap{ "key": AzureArgs{...} }
type AzureMapInput interface {
	pulumi.Input

	ToAzureMapOutput() AzureMapOutput
	ToAzureMapOutputWithContext(context.Context) AzureMapOutput
}

type AzureMap map[string]AzureInput

func (AzureMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Azure)(nil)).Elem()
}

func (i AzureMap) ToAzureMapOutput() AzureMapOutput {
	return i.ToAzureMapOutputWithContext(context.Background())
}

func (i AzureMap) ToAzureMapOutputWithContext(ctx context.Context) AzureMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureMapOutput)
}

type AzureOutput struct{ *pulumi.OutputState }

func (AzureOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Azure)(nil)).Elem()
}

func (o AzureOutput) ToAzureOutput() AzureOutput {
	return o
}

func (o AzureOutput) ToAzureOutputWithContext(ctx context.Context) AzureOutput {
	return o
}

// The client id for the Azure application
func (o AzureOutput) ClientId() pulumi.StringOutput {
	return o.ApplyT(func(v *Azure) pulumi.StringOutput { return v.ClientId }).(pulumi.StringOutput)
}

// The type of environment. Valid options are [AZURE AZURE*US*GOVERNMENT]
func (o AzureOutput) EnvironmentType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Azure) pulumi.StringPtrOutput { return v.EnvironmentType }).(pulumi.StringPtrOutput)
}

// The Name of the Harness secret containing the key for the Azure application
func (o AzureOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *Azure) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// The name of the cloud provider.
func (o AzureOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Azure) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The tenant id for the Azure application
func (o AzureOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v *Azure) pulumi.StringOutput { return v.TenantId }).(pulumi.StringOutput)
}

type AzureArrayOutput struct{ *pulumi.OutputState }

func (AzureArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Azure)(nil)).Elem()
}

func (o AzureArrayOutput) ToAzureArrayOutput() AzureArrayOutput {
	return o
}

func (o AzureArrayOutput) ToAzureArrayOutputWithContext(ctx context.Context) AzureArrayOutput {
	return o
}

func (o AzureArrayOutput) Index(i pulumi.IntInput) AzureOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Azure {
		return vs[0].([]*Azure)[vs[1].(int)]
	}).(AzureOutput)
}

type AzureMapOutput struct{ *pulumi.OutputState }

func (AzureMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Azure)(nil)).Elem()
}

func (o AzureMapOutput) ToAzureMapOutput() AzureMapOutput {
	return o
}

func (o AzureMapOutput) ToAzureMapOutputWithContext(ctx context.Context) AzureMapOutput {
	return o
}

func (o AzureMapOutput) MapIndex(k pulumi.StringInput) AzureOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Azure {
		return vs[0].(map[string]*Azure)[vs[1].(string)]
	}).(AzureOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AzureInput)(nil)).Elem(), &Azure{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureArrayInput)(nil)).Elem(), AzureArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureMapInput)(nil)).Elem(), AzureMap{})
	pulumi.RegisterOutputType(AzureOutput{})
	pulumi.RegisterOutputType(AzureArrayOutput{})
	pulumi.RegisterOutputType(AzureMapOutput{})
}
