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
    /// StationTotalStandsAvailabilities
    /// </summary>
    [DataContract]
        public partial class StationTotalStandsAvailabilities :  IEquatable<StationTotalStandsAvailabilities>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="StationTotalStandsAvailabilities" /> class.
        /// </summary>
        /// <param name="bikes">bikes.</param>
        /// <param name="stands">stands.</param>
        /// <param name="mechanicalBikes">mechanicalBikes.</param>
        /// <param name="electricalBikes">electricalBikes.</param>
        /// <param name="electricalInternalBatteryBikes">electricalInternalBatteryBikes.</param>
        /// <param name="electricalRemovableBatteryBikes">electricalRemovableBatteryBikes.</param>
        public StationTotalStandsAvailabilities(int? bikes = default(int?), int? stands = default(int?), int? mechanicalBikes = default(int?), int? electricalBikes = default(int?), int? electricalInternalBatteryBikes = default(int?), int? electricalRemovableBatteryBikes = default(int?))
        {
            this.Bikes = bikes;
            this.Stands = stands;
            this.MechanicalBikes = mechanicalBikes;
            this.ElectricalBikes = electricalBikes;
            this.ElectricalInternalBatteryBikes = electricalInternalBatteryBikes;
            this.ElectricalRemovableBatteryBikes = electricalRemovableBatteryBikes;
        }
        
        /// <summary>
        /// Gets or Sets Bikes
        /// </summary>
        [DataMember(Name="bikes", EmitDefaultValue=false)]
        public int? Bikes { get; set; }

        /// <summary>
        /// Gets or Sets Stands
        /// </summary>
        [DataMember(Name="stands", EmitDefaultValue=false)]
        public int? Stands { get; set; }

        /// <summary>
        /// Gets or Sets MechanicalBikes
        /// </summary>
        [DataMember(Name="mechanicalBikes", EmitDefaultValue=false)]
        public int? MechanicalBikes { get; set; }

        /// <summary>
        /// Gets or Sets ElectricalBikes
        /// </summary>
        [DataMember(Name="electricalBikes", EmitDefaultValue=false)]
        public int? ElectricalBikes { get; set; }

        /// <summary>
        /// Gets or Sets ElectricalInternalBatteryBikes
        /// </summary>
        [DataMember(Name="electricalInternalBatteryBikes", EmitDefaultValue=false)]
        public int? ElectricalInternalBatteryBikes { get; set; }

        /// <summary>
        /// Gets or Sets ElectricalRemovableBatteryBikes
        /// </summary>
        [DataMember(Name="electricalRemovableBatteryBikes", EmitDefaultValue=false)]
        public int? ElectricalRemovableBatteryBikes { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class StationTotalStandsAvailabilities {\n");
            sb.Append("  Bikes: ").Append(Bikes).Append("\n");
            sb.Append("  Stands: ").Append(Stands).Append("\n");
            sb.Append("  MechanicalBikes: ").Append(MechanicalBikes).Append("\n");
            sb.Append("  ElectricalBikes: ").Append(ElectricalBikes).Append("\n");
            sb.Append("  ElectricalInternalBatteryBikes: ").Append(ElectricalInternalBatteryBikes).Append("\n");
            sb.Append("  ElectricalRemovableBatteryBikes: ").Append(ElectricalRemovableBatteryBikes).Append("\n");
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
            return this.Equals(input as StationTotalStandsAvailabilities);
        }

        /// <summary>
        /// Returns true if StationTotalStandsAvailabilities instances are equal
        /// </summary>
        /// <param name="input">Instance of StationTotalStandsAvailabilities to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(StationTotalStandsAvailabilities input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Bikes == input.Bikes ||
                    (this.Bikes != null &&
                    this.Bikes.Equals(input.Bikes))
                ) && 
                (
                    this.Stands == input.Stands ||
                    (this.Stands != null &&
                    this.Stands.Equals(input.Stands))
                ) && 
                (
                    this.MechanicalBikes == input.MechanicalBikes ||
                    (this.MechanicalBikes != null &&
                    this.MechanicalBikes.Equals(input.MechanicalBikes))
                ) && 
                (
                    this.ElectricalBikes == input.ElectricalBikes ||
                    (this.ElectricalBikes != null &&
                    this.ElectricalBikes.Equals(input.ElectricalBikes))
                ) && 
                (
                    this.ElectricalInternalBatteryBikes == input.ElectricalInternalBatteryBikes ||
                    (this.ElectricalInternalBatteryBikes != null &&
                    this.ElectricalInternalBatteryBikes.Equals(input.ElectricalInternalBatteryBikes))
                ) && 
                (
                    this.ElectricalRemovableBatteryBikes == input.ElectricalRemovableBatteryBikes ||
                    (this.ElectricalRemovableBatteryBikes != null &&
                    this.ElectricalRemovableBatteryBikes.Equals(input.ElectricalRemovableBatteryBikes))
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
                if (this.Bikes != null)
                    hashCode = hashCode * 59 + this.Bikes.GetHashCode();
                if (this.Stands != null)
                    hashCode = hashCode * 59 + this.Stands.GetHashCode();
                if (this.MechanicalBikes != null)
                    hashCode = hashCode * 59 + this.MechanicalBikes.GetHashCode();
                if (this.ElectricalBikes != null)
                    hashCode = hashCode * 59 + this.ElectricalBikes.GetHashCode();
                if (this.ElectricalInternalBatteryBikes != null)
                    hashCode = hashCode * 59 + this.ElectricalInternalBatteryBikes.GetHashCode();
                if (this.ElectricalRemovableBatteryBikes != null)
                    hashCode = hashCode * 59 + this.ElectricalRemovableBatteryBikes.GetHashCode();
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
