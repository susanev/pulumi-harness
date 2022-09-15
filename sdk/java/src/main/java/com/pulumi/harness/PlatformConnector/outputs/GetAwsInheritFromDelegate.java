// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetAwsInheritFromDelegate {
    private List<String> delegateSelectors;

    private GetAwsInheritFromDelegate() {}
    public List<String> delegateSelectors() {
        return this.delegateSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAwsInheritFromDelegate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> delegateSelectors;
        public Builder() {}
        public Builder(GetAwsInheritFromDelegate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delegateSelectors = defaults.delegateSelectors;
        }

        @CustomType.Setter
        public Builder delegateSelectors(List<String> delegateSelectors) {
            this.delegateSelectors = Objects.requireNonNull(delegateSelectors);
            return this;
        }
        public Builder delegateSelectors(String... delegateSelectors) {
            return delegateSelectors(List.of(delegateSelectors));
        }
        public GetAwsInheritFromDelegate build() {
            final var o = new GetAwsInheritFromDelegate();
            o.delegateSelectors = delegateSelectors;
            return o;
        }
    }
}
