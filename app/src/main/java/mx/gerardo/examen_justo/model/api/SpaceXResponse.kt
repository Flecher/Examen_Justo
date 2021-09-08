package mx.gerardo.examen_justo.model.api


data class SpaceXResponseItem(
    val active: Boolean,
    val boosters: Float,
    val company: String,
    val cost_per_launch: Float,
    val country: String,
    val description: String,
    val diameter: Diameter,
    val engines: Engines,
    val first_flight: String,
    val first_stage: FirstStage,
    val flickr_images: List<String>,
    val height: Height,
    val id: Float,
    val landing_legs: LandingLegs,
    val mass: Mass,
    val payload_weights: List<PayloadWeight>,
    val rocket_id: String,
    val rocket_name: String,
    val rocket_type: String,
    val second_stage: SecondStage,
    val stages: Float,
    val success_rate_pct: Float,
    val wikipedia: String
)

data class Diameter(
    val feet: Float,
    val meters: Float
)

data class Engines(
    val engine_loss_max: Any,
    val isp: Isp,
    val layout: Any,
    val number: Float,
    val propellant_1: String,
    val propellant_2: String,
    val thrust_sea_level: ThrustSeaLevel,
    val thrust_to_weight: Float,
    val thrust_vacuum: ThrustVacuum,
    val type: String,
    val version: String
)

data class FirstStage(
    val burn_time_sec: Any,
    val engines: Float,
    val fuel_amount_tons: Float,
    val reusable: Boolean,
    val thrust_sea_level: ThrustSeaLevelX,
    val thrust_vacuum: ThrustVacuumX
)

data class Height(
    val feet: Float,
    val meters: Float
)

data class LandingLegs(
    val material: String,
    val number: Float
)

data class Mass(
    val kg: Float,
    val lb: Float
)

data class PayloadWeight(
    val id: String,
    val kg: Float,
    val lb: Float,
    val name: String
)

data class SecondStage(
    val burn_time_sec: Any,
    val engines: Float,
    val fuel_amount_tons: Float,
    val payloads: Payloads,
    val reusable: Boolean,
    val thrust: Thrust
)

data class Isp(
    val sea_level: Float,
    val vacuum: Float
)

data class ThrustSeaLevel(
    val kN: Float,
    val lbf: Float
)

data class ThrustVacuum(
    val kN: Float,
    val lbf: Float
)

data class ThrustSeaLevelX(
    val kN: Float,
    val lbf: Float
)

data class ThrustVacuumX(
    val kN: Float,
    val lbf: Float
)

data class Payloads(
    val composite_fairing: CompositeFairing,
    val option_1: String,
    val option_2: String
)

data class Thrust(
    val kN: Float,
    val lbf: Float
)

data class CompositeFairing(
    val diameter: DiameterX,
    val height: HeightX
)

data class DiameterX(
    val feet: Any,
    val meters: Any
)

data class HeightX(
    val feet: Any,
    val meters: Any
)