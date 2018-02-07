Date.prototype.toDateInputValue = (function() {
    var local = new Date(this);
    local.setMinutes(this.getMinutes() - this.getTimezoneOffset());
    return local.toJSON().slice(0,10);
});

window.onload = function() {
    var elements = document.getElementsByClassName('datePicker');
    for (var i = 0; i < elements.length; i++) {
        elements[i].value = new Date().toDateInputValue();
    }
    //
};