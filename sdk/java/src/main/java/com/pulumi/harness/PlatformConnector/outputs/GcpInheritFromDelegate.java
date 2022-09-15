// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.harness.PlatformConnector.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GcpInheritFromDelegate {
    /**
     * @return The delegates to inherit the credentials from.
     * 
     */
    private List<String> delegateSelectors;

    private GcpInheritFromDelegate() {}
    /**
     * @return The delegates to inherit the credentials from.
     * 
     */
    public List<String> delegateSelectors() {
        return this.delegateSelectors;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GcpInheritFromDelegate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<String> delegateSelectors;
        public Builder() {}
        public Builder(GcpInheritFromDelegate defaults) {
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
        public GcpInheritFromDelegate build() {
            final var o = new GcpInheritFromDelegate();
            o.delegateSelectors = delegateSelectors;
            return o;
        }
    }
}
