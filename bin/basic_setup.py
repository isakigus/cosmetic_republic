try:
    import envoy
except ImportError:
    try:
        import pip
        print('installing envoy')
        pip._internal.main(['install', 'envoy'])
    except ImportError:
        print('pip not found into the system... please install it')
        exit()

execute = envoy.run
print('execute linked')
