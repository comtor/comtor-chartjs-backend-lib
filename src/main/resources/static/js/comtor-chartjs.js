function drawChartJs(canvasId, containerId, endpoint) {
    var requestJson = $.getJSON(endpoint, function (data) {
        if ((data == null) || (data.length == 0) || ((data.length == 1) && (data[0].value == null))) {
            var container = document.getElementById(containerId);
            container.innerHTML = "<div class='comtor-alert-info'>No se encontraron datos para mostrar.</div>";
        } else {
            var ctx = document.getElementById(canvasId);
            data = prepareComtorPlugins(data);
            console.log(data);
            var myChart = new Chart(ctx, data);
        }
    });
    requestJson.fail(function (d) {
        var container = document.getElementById(containerId);
        container.innerHTML = "<div class='comtor-alert-info'>" + d + "</div>";
    });

}

function prepareComtorPlugins(data) {
    if (data.comtorOptions === undefined || data.comtorOptions.labelsFormat === undefined) {
        return data;
    }
    var labelFormat = data.comtorOptions.labelsFormat.format;

    switch (labelFormat) {
        case "percentage":
            return preparePercentageFormat(data);
            break;
        case "currency":
            return prepareCurrencyFormat(data);
            break;
        case "number":
            return prepareNumberFormat(data);
            break;
        default:
            console.log("The format " + labelFormat + " is wrong or not supported");
    }
}



function prepareNumberFormat(data) {
    var dataAxis = "";
    if (data.type == "horizontalBar") {
        dataAxis = "x";
    } else if (data.type == "bar") {
        dataAxis = "y";
    }


    data = createPropertiesTooltip(data);
    data.options.tooltips.callbacks.label = function (tooltipItem, chartData) {
        return new Intl.NumberFormat().format(chartData.datasets[tooltipItem.datasetIndex].data[tooltipItem.index]);
    };


    if (dataAxis == "x") {
        data = createPropertiesForAxisTicks("x", data);
        data.options.scales.xAxes[0].ticks.callback = function (value, index, values) {
            return  new Intl.NumberFormat().format(value);
        };


    } else if (dataAxis == "y") {
        data = createPropertiesForAxisTicks("y", data);
        data.options.scales.yAxes[0].ticks.callback = function (value, index, values) {
            return new Intl.NumberFormat().format(value);
        };
    }
    return data;


}



function preparePercentageFormat(data) {
    var dataAxis = "";
    if (data.type == "horizontalBar") {
        dataAxis = "x";
    } else if (data.type == "bar") {
        dataAxis = "y";
    }

    data = createPropertiesTooltip(data);
    data.options.tooltips.callbacks.label = function (tooltipItem, chartData) {
        return new Intl.NumberFormat().format(chartData.datasets[tooltipItem.datasetIndex].data[tooltipItem.index]) + '%';
    };



    if (dataAxis == "x") {
        data = createPropertiesForAxisTicks("x", data);
        data.options.scales.xAxes[0].ticks.callback = function (value, index, values) {
            return  new Intl.NumberFormat().format(value) + '%';
        };


    } else if (dataAxis == "y") {
        data = createPropertiesForAxisTicks("y", data);
        data.options.scales.yAxes[0].ticks.callback = function (value, index, values) {
            return new Intl.NumberFormat().format(value) + '%';
        };
    }
    return data;
}



function prepareCurrencyFormat(data) {
    var currency = data.comtorOptions.labelsFormat.currencySymbol;
    var dataAxis = "";
    if (data.type == "horizontalBar") {
        dataAxis = "x";
    } else if (data.type == "bar") {
        dataAxis = "y";
    }


    data = createPropertiesTooltip(data);
    data.options.tooltips.callbacks.label = function (tooltipItem, chartData) {
        return currency + new Intl.NumberFormat().format(chartData.datasets[tooltipItem.datasetIndex].data[tooltipItem.index]);
    };



    if (dataAxis == "x") {
        data = createPropertiesForAxisTicks("x", data);
        data.options.scales.xAxes[0].ticks.callback = function (value, index, values) {
            return currency + new Intl.NumberFormat().format(value);
        };

    } else if (dataAxis == "y") {
        data = createPropertiesForAxisTicks("y", data);
        data.options.scales.yAxes[0].ticks.callback = function (value, index, values) {
            return currency + new Intl.NumberFormat().format(value);
        };
    }

    return data;

}

function createPropertiesTooltip(data) {
    //Se definen el callback del tooltip
    if (data.options.tooltips === undefined) {
        data.options.tooltips = {};
    }
    if (data.options.tooltips.callbacks === undefined) {
        data.options.tooltips.callbacks = {};
    }

    return data;
}

function createPropertiesForAxisTicks(axis, data) {

    if (data.options.scales === undefined) {
        data.options.scales = {};
    }

    if (axis == "x") {
        if (data.options.scales.xAxes === undefined) {
            data.options.scales.xAxes = [];
        }
        if (data.options.scales.xAxes[0] === undefined) {
            data.options.scales.xAxes[0] = {};
        }
        if (data.options.scales.xAxes[0].ticks === undefined) {
            data.options.scales.xAxes[0].ticks = {};
        }
        if (data.options.scales.xAxes[0].ticks.callback === undefined) {
            data.options.scales.xAxes[0].ticks.callback = {};

        }
    } else if (axis == "y") {
        if (data.options.scales.yAxes === undefined) {
            data.options.scales.yAxes = [];
        }
        if (data.options.scales.yAxes[0] === undefined) {
            data.options.scales.yAxes[0] = {};
        }
        if (data.options.scales.yAxes[0].ticks === undefined) {
            data.options.scales.yAxes[0].ticks = {};
        }
        if (data.options.scales.yAxes[0].ticks.callback === undefined) {
            data.options.scales.yAxes[0].ticks.callback = {};

        }
    }
    return data;
}


