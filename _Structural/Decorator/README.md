# Decorator Design Pattern

### Gist
- It allows behavior to be added to an individual object, 
dynamically, without affecting the behavior of other objects from 
the same class
- One can add functionality to an existing object 
without altering its structure
- This pattern acts as a wrapper to existing class
- Attach additional responsibilities to an object dynamically
---

## Example 1

### Given 

- 

### Problem

- 

### Solution

- 

---

## Example 2

### Given 

- A Tennis Court Booking System, where there are some additional 
AddOns with the booking of ground, such as
    - Coaching,
    - Rackets,
    - Ball pack

### Problem

- AddOns cannot be provided separately, so inheriting AddOns 
from `CourtBooking` Class is a problem
- AddOns can be used as Boolean fields for `CourtBooking` Class, 
such as `GrassCourtBooking` with `Rackets - True`, 
`BallPack - False`, etc. This brings problems such as :
    - The quantity of AddOn creates problem
    - The `CourtBooking` Class needs to be changed whenever new 
    AddOn is added, or removed.
    - This doesn't follow SOLID principle -> Open for Extensions 
    Closed for Modifications


### Solution

- Creating a wrapper around `CourtBooking` -> `AddOnDecorator` 
which `is a` and `has a` `CourtBooking` Component. 
- i.e. `AddOnDecorator` inherits `CourtBooking` also has a field 
of `CourtBooking`
