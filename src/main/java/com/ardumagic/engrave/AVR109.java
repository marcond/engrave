/* Licensed under the Apache License, version 2.0. See disclaimer at end of file.

   This class implements the AVR109 protocol, which is used by boards like
   Arduino Leonardo, Pro Micro and others based on ATmega32U4 from Microchip.

   The bootloader used by these boards is called Caterina and is available at:
      https://github.com/arduino/ArduinoCore-avr/tree/master/bootloaders/caterina

   Microchip documents this protocol on Application Note 1644 available at:
      https://www.microchip.com/wwwAppNotes/AppNotes.aspx?appnote=en591230
*/
package com.ardumagic.engrave;

public class AVR109 implements Programmer
{
    private final static String PROTOCOL_NAME = "AVR109";

    @Override
    public String getProtocol ()
    {
        return (PROTOCOL_NAME.toLowerCase ());
    }
}

/*
   Copyright 2020 Marcond Marchi (ardumagic.com)

   Licensed under the Apache License, Version 2.0 (the "License"); you may not
   use this file except in compliance with the License. You may obtain a copy of
   the License at

   http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
   WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
   License for the specific language governing permissions and limitations under
   the License.
*/