// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package service

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for creating an AWS Lambda service. This resource uses the config-as-code API's. When updating the `name` or `path` of this resource you should typically also set the `createBeforeDestroy = true` lifecycle setting.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness"
//	"github.com/lbrlabs/pulumi-harness/sdk/go/harness/Service"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleApplication, err := harness.NewApplication(ctx, "exampleApplication", nil)
//			if err != nil {
//				return err
//			}
//			_, err = Service.NewLambda(ctx, "exampleLambda", &Service.LambdaArgs{
//				AppId:       exampleApplication.ID(),
//				Description: pulumi.String("Service for deploying AWS Lambda functions."),
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
// # Import using the Harness application id and service id
//
// ```sh
//
//	$ pulumi import harness:Service/lambda:Lambda example <app_id>/<svc_id>
//
// ```
type Lambda struct {
	pulumi.CustomResourceState

	// The id of the application the service belongs to
	AppId pulumi.StringOutput `pulumi:"appId"`
	// Description of th service
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Name of the service
	Name pulumi.StringOutput `pulumi:"name"`
	// Variables to be used in the service
	Variables LambdaVariableArrayOutput `pulumi:"variables"`
}

// NewLambda registers a new resource with the given unique name, arguments, and options.
func NewLambda(ctx *pulumi.Context,
	name string, args *LambdaArgs, opts ...pulumi.ResourceOption) (*Lambda, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppId == nil {
		return nil, errors.New("invalid value for required argument 'AppId'")
	}
	var resource Lambda
	err := ctx.RegisterResource("harness:Service/lambda:Lambda", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLambda gets an existing Lambda resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLambda(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LambdaState, opts ...pulumi.ResourceOption) (*Lambda, error) {
	var resource Lambda
	err := ctx.ReadResource("harness:Service/lambda:Lambda", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Lambda resources.
type lambdaState struct {
	// The id of the application the service belongs to
	AppId *string `pulumi:"appId"`
	// Description of th service
	Description *string `pulumi:"description"`
	// Name of the service
	Name *string `pulumi:"name"`
	// Variables to be used in the service
	Variables []LambdaVariable `pulumi:"variables"`
}

type LambdaState struct {
	// The id of the application the service belongs to
	AppId pulumi.StringPtrInput
	// Description of th service
	Description pulumi.StringPtrInput
	// Name of the service
	Name pulumi.StringPtrInput
	// Variables to be used in the service
	Variables LambdaVariableArrayInput
}

func (LambdaState) ElementType() reflect.Type {
	return reflect.TypeOf((*lambdaState)(nil)).Elem()
}

type lambdaArgs struct {
	// The id of the application the service belongs to
	AppId string `pulumi:"appId"`
	// Description of th service
	Description *string `pulumi:"description"`
	// Name of the service
	Name *string `pulumi:"name"`
	// Variables to be used in the service
	Variables []LambdaVariable `pulumi:"variables"`
}

// The set of arguments for constructing a Lambda resource.
type LambdaArgs struct {
	// The id of the application the service belongs to
	AppId pulumi.StringInput
	// Description of th service
	Description pulumi.StringPtrInput
	// Name of the service
	Name pulumi.StringPtrInput
	// Variables to be used in the service
	Variables LambdaVariableArrayInput
}

func (LambdaArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*lambdaArgs)(nil)).Elem()
}

type LambdaInput interface {
	pulumi.Input

	ToLambdaOutput() LambdaOutput
	ToLambdaOutputWithContext(ctx context.Context) LambdaOutput
}

func (*Lambda) ElementType() reflect.Type {
	return reflect.TypeOf((**Lambda)(nil)).Elem()
}

func (i *Lambda) ToLambdaOutput() LambdaOutput {
	return i.ToLambdaOutputWithContext(context.Background())
}

func (i *Lambda) ToLambdaOutputWithContext(ctx context.Context) LambdaOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LambdaOutput)
}

// LambdaArrayInput is an input type that accepts LambdaArray and LambdaArrayOutput values.
// You can construct a concrete instance of `LambdaArrayInput` via:
//
//	LambdaArray{ LambdaArgs{...} }
type LambdaArrayInput interface {
	pulumi.Input

	ToLambdaArrayOutput() LambdaArrayOutput
	ToLambdaArrayOutputWithContext(context.Context) LambdaArrayOutput
}

type LambdaArray []LambdaInput

func (LambdaArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Lambda)(nil)).Elem()
}

func (i LambdaArray) ToLambdaArrayOutput() LambdaArrayOutput {
	return i.ToLambdaArrayOutputWithContext(context.Background())
}

func (i LambdaArray) ToLambdaArrayOutputWithContext(ctx context.Context) LambdaArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LambdaArrayOutput)
}

// LambdaMapInput is an input type that accepts LambdaMap and LambdaMapOutput values.
// You can construct a concrete instance of `LambdaMapInput` via:
//
//	LambdaMap{ "key": LambdaArgs{...} }
type LambdaMapInput interface {
	pulumi.Input

	ToLambdaMapOutput() LambdaMapOutput
	ToLambdaMapOutputWithContext(context.Context) LambdaMapOutput
}

type LambdaMap map[string]LambdaInput

func (LambdaMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Lambda)(nil)).Elem()
}

func (i LambdaMap) ToLambdaMapOutput() LambdaMapOutput {
	return i.ToLambdaMapOutputWithContext(context.Background())
}

func (i LambdaMap) ToLambdaMapOutputWithContext(ctx context.Context) LambdaMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LambdaMapOutput)
}

type LambdaOutput struct{ *pulumi.OutputState }

func (LambdaOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Lambda)(nil)).Elem()
}

func (o LambdaOutput) ToLambdaOutput() LambdaOutput {
	return o
}

func (o LambdaOutput) ToLambdaOutputWithContext(ctx context.Context) LambdaOutput {
	return o
}

// The id of the application the service belongs to
func (o LambdaOutput) AppId() pulumi.StringOutput {
	return o.ApplyT(func(v *Lambda) pulumi.StringOutput { return v.AppId }).(pulumi.StringOutput)
}

// Description of th service
func (o LambdaOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Lambda) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Name of the service
func (o LambdaOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Lambda) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Variables to be used in the service
func (o LambdaOutput) Variables() LambdaVariableArrayOutput {
	return o.ApplyT(func(v *Lambda) LambdaVariableArrayOutput { return v.Variables }).(LambdaVariableArrayOutput)
}

type LambdaArrayOutput struct{ *pulumi.OutputState }

func (LambdaArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Lambda)(nil)).Elem()
}

func (o LambdaArrayOutput) ToLambdaArrayOutput() LambdaArrayOutput {
	return o
}

func (o LambdaArrayOutput) ToLambdaArrayOutputWithContext(ctx context.Context) LambdaArrayOutput {
	return o
}

func (o LambdaArrayOutput) Index(i pulumi.IntInput) LambdaOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Lambda {
		return vs[0].([]*Lambda)[vs[1].(int)]
	}).(LambdaOutput)
}

type LambdaMapOutput struct{ *pulumi.OutputState }

func (LambdaMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Lambda)(nil)).Elem()
}

func (o LambdaMapOutput) ToLambdaMapOutput() LambdaMapOutput {
	return o
}

func (o LambdaMapOutput) ToLambdaMapOutputWithContext(ctx context.Context) LambdaMapOutput {
	return o
}

func (o LambdaMapOutput) MapIndex(k pulumi.StringInput) LambdaOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Lambda {
		return vs[0].(map[string]*Lambda)[vs[1].(string)]
	}).(LambdaOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LambdaInput)(nil)).Elem(), &Lambda{})
	pulumi.RegisterInputType(reflect.TypeOf((*LambdaArrayInput)(nil)).Elem(), LambdaArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LambdaMapInput)(nil)).Elem(), LambdaMap{})
	pulumi.RegisterOutputType(LambdaOutput{})
	pulumi.RegisterOutputType(LambdaArrayOutput{})
	pulumi.RegisterOutputType(LambdaMapOutput{})
}
