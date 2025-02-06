fun main() {
    var orbitsStar = true // Rule 1
    var hydrostaticEquilibrium = true // Rule 2
    var clearedOrbit = false // Rule 3

    // Check if orbitsStar and hydrostaticEquilibrium are both true
    if (orbitsStar && hydrostaticEquilibrium) {
        // Nested conditional to check if clearedOrbit is true
        if (clearedOrbit) {
            println("Celestial body is a planet.")
        }
    }
}
