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
    /// Station
    /// </summary>
    [DataContract]
        public partial class Station :  IEquatable<Station>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Station" /> class.
        /// </summary>
        /// <param name="number">number.</param>
        /// <param name="contractName">contractName.</param>
        /// <param name="name">name.</param>
        /// <param name="address">address.</param>
        /// <param name="position">position.</param>
        /// <param name="banking">banking.</param>
        /// <param name="bonus">bonus.</param>
        /// <param name="status">status.</param>
        /// <param name="lastUpdate">lastUpdate.</param>
        /// <param name="connected">connected.</param>
        /// <param name="overflow">overflow.</param>
        /// <param name="shape">shape.</param>
        /// <param name="totalStands">totalStands.</param>
        /// <param name="mainStands">mainStands.</param>
        /// <param name="overflowStands">overflowStands.</param>
        public Station(int? number = default(int?), string contractName = default(string), string name = default(string), string address = default(string), ParkPosition position = default(ParkPosition), bool? banking = default(bool?), bool? bonus = default(bool?), string status = default(string), DateTime? lastUpdate = default(DateTime?), bool? connected = default(bool?), bool? overflow = default(bool?), string shape = default(string), StationTotalStands totalStands = default(StationTotalStands), StationTotalStands mainStands = default(StationTotalStands), string overflowStands = default(string))
        {
            this.Number = number;
            this.ContractName = contractName;
            this.Name = name;
            this.Address = address;
            this.Position = position;
            this.Banking = banking;
            this.Bonus = bonus;
            this.Status = status;
            this.LastUpdate = lastUpdate;
            this.Connected = connected;
            this.Overflow = overflow;
            this.Shape = shape;
            this.TotalStands = totalStands;
            this.MainStands = mainStands;
            this.OverflowStands = overflowStands;
        }
        
        /// <summary>
        /// Gets or Sets Number
        /// </summary>
        [DataMember(Name="number", EmitDefaultValue=false)]
        public int? Number { get; set; }

        /// <summary>
        /// Gets or Sets ContractName
        /// </summary>
        [DataMember(Name="contractName", EmitDefaultValue=false)]
        public string ContractName { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets Address
        /// </summary>
        [DataMember(Name="address", EmitDefaultValue=false)]
        public string Address { get; set; }

        /// <summary>
        /// Gets or Sets Position
        /// </summary>
        [DataMember(Name="position", EmitDefaultValue=false)]
        public ParkPosition Position { get; set; }

        /// <summary>
        /// Gets or Sets Banking
        /// </summary>
        [DataMember(Name="banking", EmitDefaultValue=false)]
        public bool? Banking { get; set; }

        /// <summary>
        /// Gets or Sets Bonus
        /// </summary>
        [DataMember(Name="bonus", EmitDefaultValue=false)]
        public bool? Bonus { get; set; }

        /// <summary>
        /// Gets or Sets Status
        /// </summary>
        [DataMember(Name="status", EmitDefaultValue=false)]
        public string Status { get; set; }

        /// <summary>
        /// Gets or Sets LastUpdate
        /// </summary>
        [DataMember(Name="lastUpdate", EmitDefaultValue=false)]
        public DateTime? LastUpdate { get; set; }

        /// <summary>
        /// Gets or Sets Connected
        /// </summary>
        [DataMember(Name="connected", EmitDefaultValue=false)]
        public bool? Connected { get; set; }

        /// <summary>
        /// Gets or Sets Overflow
        /// </summary>
        [DataMember(Name="overflow", EmitDefaultValue=false)]
        public bool? Overflow { get; set; }

        /// <summary>
        /// Gets or Sets Shape
        /// </summary>
        [DataMember(Name="shape", EmitDefaultValue=false)]
        public string Shape { get; set; }

        /// <summary>
        /// Gets or Sets TotalStands
        /// </summary>
        [DataMember(Name="totalStands", EmitDefaultValue=false)]
        public StationTotalStands TotalStands { get; set; }

        /// <summary>
        /// Gets or Sets MainStands
        /// </summary>
        [DataMember(Name="mainStands", EmitDefaultValue=false)]
        public StationTotalStands MainStands { get; set; }

        /// <summary>
        /// Gets or Sets OverflowStands
        /// </summary>
        [DataMember(Name="overflowStands", EmitDefaultValue=false)]
        public string OverflowStands { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Station {\n");
            sb.Append("  Number: ").Append(Number).Append("\n");
            sb.Append("  ContractName: ").Append(ContractName).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Address: ").Append(Address).Append("\n");
            sb.Append("  Position: ").Append(Position).Append("\n");
            sb.Append("  Banking: ").Append(Banking).Append("\n");
            sb.Append("  Bonus: ").Append(Bonus).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
            sb.Append("  LastUpdate: ").Append(LastUpdate).Append("\n");
            sb.Append("  Connected: ").Append(Connected).Append("\n");
            sb.Append("  Overflow: ").Append(Overflow).Append("\n");
            sb.Append("  Shape: ").Append(Shape).Append("\n");
            sb.Append("  TotalStands: ").Append(TotalStands).Append("\n");
            sb.Append("  MainStands: ").Append(MainStands).Append("\n");
            sb.Append("  OverflowStands: ").Append(OverflowStands).Append("\n");
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
            return this.Equals(input as Station);
        }

        /// <summary>
        /// Returns true if Station instances are equal
        /// </summary>
        /// <param name="input">Instance of Station to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Station input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Number == input.Number ||
                    (this.Number != null &&
                    this.Number.Equals(input.Number))
                ) && 
                (
                    this.ContractName == input.ContractName ||
                    (this.ContractName != null &&
                    this.ContractName.Equals(input.ContractName))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Address == input.Address ||
                    (this.Address != null &&
                    this.Address.Equals(input.Address))
                ) && 
                (
                    this.Position == input.Position ||
                    (this.Position != null &&
                    this.Position.Equals(input.Position))
                ) && 
                (
                    this.Banking == input.Banking ||
                    (this.Banking != null &&
                    this.Banking.Equals(input.Banking))
                ) && 
                (
                    this.Bonus == input.Bonus ||
                    (this.Bonus != null &&
                    this.Bonus.Equals(input.Bonus))
                ) && 
                (
                    this.Status == input.Status ||
                    (this.Status != null &&
                    this.Status.Equals(input.Status))
                ) && 
                (
                    this.LastUpdate == input.LastUpdate ||
                    (this.LastUpdate != null &&
                    this.LastUpdate.Equals(input.LastUpdate))
                ) && 
                (
                    this.Connected == input.Connected ||
                    (this.Connected != null &&
                    this.Connected.Equals(input.Connected))
                ) && 
                (
                    this.Overflow == input.Overflow ||
                    (this.Overflow != null &&
                    this.Overflow.Equals(input.Overflow))
                ) && 
                (
                    this.Shape == input.Shape ||
                    (this.Shape != null &&
                    this.Shape.Equals(input.Shape))
                ) && 
                (
                    this.TotalStands == input.TotalStands ||
                    (this.TotalStands != null &&
                    this.TotalStands.Equals(input.TotalStands))
                ) && 
                (
                    this.MainStands == input.MainStands ||
                    (this.MainStands != null &&
                    this.MainStands.Equals(input.MainStands))
                ) && 
                (
                    this.OverflowStands == input.OverflowStands ||
                    (this.OverflowStands != null &&
                    this.OverflowStands.Equals(input.OverflowStands))
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
                if (this.Number != null)
                    hashCode = hashCode * 59 + this.Number.GetHashCode();
                if (this.ContractName != null)
                    hashCode = hashCode * 59 + this.ContractName.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Address != null)
                    hashCode = hashCode * 59 + this.Address.GetHashCode();
                if (this.Position != null)
                    hashCode = hashCode * 59 + this.Position.GetHashCode();
                if (this.Banking != null)
                    hashCode = hashCode * 59 + this.Banking.GetHashCode();
                if (this.Bonus != null)
                    hashCode = hashCode * 59 + this.Bonus.GetHashCode();
                if (this.Status != null)
                    hashCode = hashCode * 59 + this.Status.GetHashCode();
                if (this.LastUpdate != null)
                    hashCode = hashCode * 59 + this.LastUpdate.GetHashCode();
                if (this.Connected != null)
                    hashCode = hashCode * 59 + this.Connected.GetHashCode();
                if (this.Overflow != null)
                    hashCode = hashCode * 59 + this.Overflow.GetHashCode();
                if (this.Shape != null)
                    hashCode = hashCode * 59 + this.Shape.GetHashCode();
                if (this.TotalStands != null)
                    hashCode = hashCode * 59 + this.TotalStands.GetHashCode();
                if (this.MainStands != null)
                    hashCode = hashCode * 59 + this.MainStands.GetHashCode();
                if (this.OverflowStands != null)
                    hashCode = hashCode * 59 + this.OverflowStands.GetHashCode();
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