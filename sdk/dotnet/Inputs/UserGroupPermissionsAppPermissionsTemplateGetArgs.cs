// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Harness.Inputs
{

    public sealed class UserGroupPermissionsAppPermissionsTemplateGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("actions", required: true)]
        private InputList<string>? _actions;
        public InputList<string> Actions
        {
            get => _actions ?? (_actions = new InputList<string>());
            set => _actions = value;
        }

        [Input("appIds")]
        private InputList<string>? _appIds;
        public InputList<string> AppIds
        {
            get => _appIds ?? (_appIds = new InputList<string>());
            set => _appIds = value;
        }

        [Input("templateIds")]
        private InputList<string>? _templateIds;
        public InputList<string> TemplateIds
        {
            get => _templateIds ?? (_templateIds = new InputList<string>());
            set => _templateIds = value;
        }

        public UserGroupPermissionsAppPermissionsTemplateGetArgs()
        {
        }
        public static new UserGroupPermissionsAppPermissionsTemplateGetArgs Empty => new UserGroupPermissionsAppPermissionsTemplateGetArgs();
    }
}
