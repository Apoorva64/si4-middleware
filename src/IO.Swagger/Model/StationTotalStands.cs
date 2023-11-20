/*
 * JcDecaux
 *
 * JcDecaux API
 *
 * OpenAPI spec version: 1.0.0
 *
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using System.Text;
using Newtonsoft.Json;

namespace JCDECAUX.rest.client.Model
{
    /// <summary>
    /// StationTotalStands
    /// </summary>
    [DataContract]
        public partial class StationTotalStands :  IEquatable<StationTotalStands>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StationTotalStands" /> class.
        /// </summary>
        /// <param name="availabilities">availabilities.</param>
        /// <param name="capacity">capacity.</param>
        public StationTotalStands(StationTotalStandsAvailabilities availabilities = default(StationTotalStandsAvailabilities), int? capacity = default(int?))
        {
            this.Availabilities = availabilities;
            this.Capacity = capacity;
        }
        
        /// <summary>
        /// Gets or Sets Availabilities
        /// </summary>
        [DataMember(Name="availabilities", EmitDefaultValue=false)]
        public StationTotalStandsAvailabilities Availabilities { get; set; }

        /// <summary>
        /// Gets or Sets Capacity
        /// </summary>
        [DataMember(Name="capacity", EmitDefaultValue=false)]
        public int? Capacity { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StationTotalStands {\n");
            sb.Append("  Availabilities: ").Append(Availabilities).Append("\n");
            sb.Append("  Capacity: ").Append(Capacity).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as StationTotalStands);
        }

        /// <summary>
        /// Returns true if StationTotalStands instances are equal
        /// </summary>
        /// <param name="input">Instance of StationTotalStands to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StationTotalStands input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Availabilities == input.Availabilities ||
                    (this.Availabilities != null &&
                    this.Availabilities.Equals(input.Availabilities))
                ) && 
                (
                    this.Capacity == input.Capacity ||
                    (this.Capacity != null &&
                    this.Capacity.Equals(input.Capacity))
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Availabilities != null)
                    hashCode = hashCode * 59 + this.Availabilities.GetHashCode();
                if (this.Capacity != null)
                    hashCode = hashCode * 59 + this.Capacity.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }
}