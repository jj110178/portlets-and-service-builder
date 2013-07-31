<%
/**
 * Copyright (c) 2000-2012 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */
%>

<%@ taglib uri="http://java.sun.com/portlet_2_0" prefix="portlet" %>
<%@ taglib prefix="aui" uri="http://liferay.com/tld/aui" %>
<portlet:defineObjects />

<div id="myDatePicker" class="aui-datepicker-example aui-helper-clearfix"></div>

<div id="myOtherDatePicker" class="aui-datepicker-example aui-helper-clearfix">
  <input type="text" size="50" id="myInput" />
</div>
<script type="text/javascript" charset="utf-8">

AUI().use(
  'aui-datepicker',
  function(A) {
    new A.DatePickerSelect(
      {
        appendOrder: ['m', 'd', 'y'],
        calendar: {
          dates: ['10/10/2013']
        }
      }
    ).render('#myDatePicker');

    new A.DatePicker(
      {
        calendar: {
          dateFormat: '%m/%d/%Y',
          dates: ['10/10/2013']
        },
        trigger: '#myInput'
      }
    ).render('#myOtherDatePicker');
  }
);
</script>
<!-- <input type="text" size="50" id="myDatepicker" />
 
 <script type="text/javascript" charset="utf-8">
 AUI().use('aui-datepicker', function(A) {
     var simpleDatepicker1 = new A.DatePicker({
         trigger: '#myDatepicker',
         dateFormat: '%d/%m/%y %A',
         setValue: true,
         minDate: '01/01/2000',
        maxDate: '09/05/2020',
        selectMultipleDates: false
    })
    .render();
});
</script> -->

